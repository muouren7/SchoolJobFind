package com.example.schooljobfind.Common.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.schooljobfind.Common.Mapper.InterviewMapper;
import com.example.schooljobfind.Common.Resp.Result;
import com.example.schooljobfind.Common.Service.InterviewService;
import com.example.schooljobfind.Common.entity.Interview;
import com.example.schooljobfind.Common.entity.vo.InterViewVo;
import lombok.val;
import org.springframework.stereotype.Service;

/**
 * 面试邀约表(Interview)表服务实现类
 *
 * @author makejava
 * @since 2023-04-09 17:35:57
 */
@Service("interviewService")
public class InterviewServiceImpl extends ServiceImpl<InterviewMapper, Interview> implements InterviewService {

    @Override
    public Result<InterViewVo> addInterView(InterViewVo vo) {
        Interview interview = new Interview(Long.valueOf("0"),Long.valueOf(vo.getSid()),Long.valueOf(vo.getBid()),Long.valueOf(vo.getJid()),vo.getFtime(),vo.getIsaccept(),vo.getAddr(),vo.getDeleted());
        System.out.println(interview);
        if(save(interview)){
            return new Result<>(200,"邀请成功",vo);
        }else{
            return new Result<>(200,"邀请失败",null);
        }
    }
}

