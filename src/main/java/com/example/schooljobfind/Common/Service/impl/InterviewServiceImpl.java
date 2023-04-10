package com.example.schooljobfind.Common.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.schooljobfind.Common.Mapper.InterviewMapper;
import com.example.schooljobfind.Common.Service.InterviewService;
import com.example.schooljobfind.Common.entity.Interview;
import org.springframework.stereotype.Service;

/**
 * 面试邀约表(Interview)表服务实现类
 *
 * @author makejava
 * @since 2023-04-09 17:35:57
 */
@Service("interviewService")
public class InterviewServiceImpl extends ServiceImpl<InterviewMapper, Interview> implements InterviewService {

}

