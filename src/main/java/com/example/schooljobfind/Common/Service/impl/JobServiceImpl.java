package com.example.schooljobfind.Common.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.schooljobfind.Common.Mapper.JobMapper;
import com.example.schooljobfind.Common.Service.JobService;
import com.example.schooljobfind.Common.entity.Job;
import org.springframework.stereotype.Service;

/**
 * 职位表(Job)表服务实现类
 *
 * @author makejava
 * @since 2023-04-09 17:36:45
 */
@Service("jobService")
public class JobServiceImpl extends ServiceImpl<JobMapper, Job> implements JobService {

}

