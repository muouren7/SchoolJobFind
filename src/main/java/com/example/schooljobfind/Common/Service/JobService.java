package com.example.schooljobfind.Common.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.schooljobfind.Common.Resp.Result;
import com.example.schooljobfind.Common.Resp.ResultList;
import com.example.schooljobfind.Common.entity.Job;
import com.example.schooljobfind.Common.entity.Users;
import com.example.schooljobfind.Common.entity.vo.JobVo;
import com.example.schooljobfind.Common.entity.vo.UsersVo;


/**
 * 职位表(Job)表服务接口
 *
 * @author makejava
 * @since 2023-04-09 17:36:45
 */
public interface JobService extends IService<Job> {

    Result<JobVo> addJob(JobVo vo);

    ResultList<JobVo> getBossJob(UsersVo u);

    ResultList<JobVo> search(String key);
}
