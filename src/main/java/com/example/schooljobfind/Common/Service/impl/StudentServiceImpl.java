package com.example.schooljobfind.Common.Service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.schooljobfind.Common.Mapper.StudentMapper;
import com.example.schooljobfind.Common.Resp.Result;
import com.example.schooljobfind.Common.Service.StudentService;
import com.example.schooljobfind.Common.entity.Student;
import com.example.schooljobfind.Common.entity.dio.Studentdio;
import com.example.schooljobfind.Common.entity.vo.StudentVo;

import lombok.val;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;

/**
 * 学生表(Student)表服务实现类
 *
 * @author makejava
 * @since 2023-04-09 17:33:02
 */
@Service("studentService")
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

    @Override
    public Result<StudentVo> getstuinfo(StudentVo s) {
        Student st = getById(Long.parseLong(s.getSid()));
        StudentVo studentVo = new StudentVo(String.valueOf(st.getSid()),st.getName(),st.getSex(),st.getBirth().toString(),st.getPhone(),st.getAddr(),st.getProfile(),st.getStatus(),st.getTsid(),st.getSubject(),st.getRemark(),st.getFreeze(),st.getGrade());
        return new Result<>(200,"获取成功",studentVo);

    }

    @Override
    public Result<StudentVo> updateInfo(Studentdio s) {
        Student student = new Student(Long.parseLong(s.getSid()),s.getName(),s.getSex(),s.getBirth(),s.getPhone(),s.getAddr(),s.getProfile(),s.getStatus(),s.getTsid(),s.getSubject(),s.getRemark(),s.getFreeze(),s.getGrade());
        UpdateWrapper updateWrapper = new UpdateWrapper<Student>();
//        updateWrapper.set("sid",Long.parseLong(s.getSid()));
//        updateWrapper.set("name",s.getName());
//        updateWrapper.set("sex",s.getSex());
//        updateWrapper.set("birth",new Date());
//        updateWrapper.set("phone",s.getPhone());
//        updateWrapper.set("addr",s.getAddr());
//        updateWrapper.set("profile",s.getProfile());
//        updateWrapper.set("status",s.getStatus());//s.getStatus(),s.getTsid(),s.getSubject(),s.getRemark(),s.getFreeze(),s.getGrade()
//        updateWrapper.set("tsid",s.getTsid());
//        updateWrapper.set("subject",s.getSubject());
//        updateWrapper.set("remark",s.getRemark());
//        updateWrapper.set("freeze",s.getFreeze());
//        updateWrapper.set("grade",s.getGrade());
        updateWrapper.eq("sid",Long.parseLong(s.getSid()));
        System.out.println(s);
        if(update(student,updateWrapper)){  //update(student,updateWrapper)
            StudentVo vo = new StudentVo(s.getSid(),s.getName(),s.getSex(),s.getBirth().toString(),s.getPhone(),s.getAddr(),s.getProfile(),s.getStatus(),s.getTsid(),s.getSubject(),s.getRemark(),s.getFreeze(),s.getGrade());
            return new Result<StudentVo>(200,"修改成功",vo);
        }else{
            return new Result<>(500,"修改失败");
        }
    }
}

