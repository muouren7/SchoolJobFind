package com.example.schooljobfind.Common.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.schooljobfind.Common.Resp.Result;
import com.example.schooljobfind.Common.entity.Interview;
import com.example.schooljobfind.Common.entity.vo.InterViewVo;


/**
 * 面试邀约表(Interview)表服务接口
 *
 * @author makejava
 * @since 2023-04-09 17:35:57
 */
public interface InterviewService extends IService<Interview> {

    Result<InterViewVo> addInterView(InterViewVo vo);
}
