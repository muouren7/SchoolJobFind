package com.example.schooljobfind.Common.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.schooljobfind.Common.Mapper.ResumeMapper;
import com.example.schooljobfind.Common.Service.ResumeService;
import com.example.schooljobfind.Common.entity.Resume;
import org.springframework.stereotype.Service;

/**
 * 简历表(Resume)表服务实现类
 *
 * @author makejava
 * @since 2023-04-09 17:37:16
 */
@Service("resumeService")
public class ResumeServiceImpl extends ServiceImpl<ResumeMapper, Resume> implements ResumeService {

}

