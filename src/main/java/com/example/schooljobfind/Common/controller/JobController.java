package com.example.schooljobfind.Common.controller;

import com.example.schooljobfind.Common.Resp.Result;
import com.example.schooljobfind.Common.Resp.ResultList;
import com.example.schooljobfind.Common.Service.JobService;
import com.example.schooljobfind.Common.entity.Users;
import com.example.schooljobfind.Common.entity.vo.JobVo;
import com.example.schooljobfind.Common.entity.vo.UsersVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;

    @RequestMapping("/Job/addjob")
    @ResponseBody
    public Result<JobVo> addJob(@RequestBody JobVo vo){
        return jobService.addJob(vo);
    }

    @RequestMapping("/Job/getBossjob")
    @ResponseBody
    public ResultList<JobVo> getBossJob(@RequestBody UsersVo u){
        return jobService.getBossJob(u);
    }

    @RequestMapping("/Job/searchjob/{key}")
    @ResponseBody
    public ResultList<JobVo> searchjob(@PathVariable("key") String key){
        System.out.println(key);
        return jobService.search(key);
    }
}
