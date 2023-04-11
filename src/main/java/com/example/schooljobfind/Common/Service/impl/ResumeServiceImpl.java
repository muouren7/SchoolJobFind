package com.example.schooljobfind.Common.Service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.schooljobfind.Common.Mapper.ResumeMapper;
import com.example.schooljobfind.Common.Resp.Result;
import com.example.schooljobfind.Common.Service.ResumeService;
import com.example.schooljobfind.Common.Service.StudentService;
import com.example.schooljobfind.Common.Service.UsersService;
import com.example.schooljobfind.Common.entity.Resume;
import com.example.schooljobfind.Common.entity.Student;
import com.example.schooljobfind.Common.entity.dio.Usersdio;
import com.example.schooljobfind.Common.entity.vo.ResumeVo;
import com.example.schooljobfind.Common.entity.vo.UsersVo;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 简历表(Resume)表服务实现类
 *
 * @author makejava
 * @since 2023-04-09 17:37:16
 */
@Service("resumeService")
public class ResumeServiceImpl extends ServiceImpl<ResumeMapper, Resume> implements ResumeService {

    @Autowired
    private UsersService usersService;
    @Autowired
    private StudentService studentService;

    @Override
    public Result<ResumeVo> getmyre(UsersVo u) {
        QueryWrapper resumeQueryWrapper = new QueryWrapper<Resume>();
        resumeQueryWrapper.eq("sid",Long.parseLong(u.getId()));
        Resume one1 = getOne(resumeQueryWrapper);
        ResumeVo resumeVo = new ResumeVo(String.valueOf(one1.getRid()), one1.getName(),one1.getSex(),one1.getProfile(),one1.getBirth(),one1.getPhone(),one1.getEmail(),one1.getAddr(),one1.getExp(),one1.getEdu(),one1.getPreskill(),one1.getSelfeva(),one1.getReurl(),one1.getRemark(),String.valueOf(one1.getSid()));
        return new Result<ResumeVo>(200,"获取成功",resumeVo);
    }

    @Override
    public Result<ResumeVo> updateResume(ResumeVo Vo) {
        Resume resume = new Resume(Long.valueOf(Vo.getRid()),Vo.getName(),Vo.getSex(),Vo.getProfile(),Vo.getBirth(),Vo.getPhone(),Vo.getEmail(),Vo.getAddr(),Vo.getExp(),Vo.getEdu(),Vo.getPreskill(),Vo.getSelfeva(),Vo.getReurl(),Vo.getRemark(),Long.parseLong(Vo.getSid()));
        UpdateWrapper updateWrapper = new UpdateWrapper<Resume>();
        updateWrapper.eq("rid",resume.getRid());
        if(update(resume,updateWrapper)){
            return new Result<>(200,"简历修改成功",Vo);
        }else{
            return new Result<>(500,"简历修改失败");
        }

    }
}

