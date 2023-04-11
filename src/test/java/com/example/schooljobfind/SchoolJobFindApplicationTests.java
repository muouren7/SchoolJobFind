package com.example.schooljobfind;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.schooljobfind.Common.Resp.Result;
import com.example.schooljobfind.Common.Resp.ResultList;
import com.example.schooljobfind.Common.Service.JobService;
import com.example.schooljobfind.Common.Service.TagschoolService;
import com.example.schooljobfind.Common.Utils.BeanCopyUtils;
import com.example.schooljobfind.Common.entity.Job;
import com.example.schooljobfind.Common.entity.Tagschool;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) //在测试的时候启动Tomcat服务器，WebSocket是需要依赖Tomcat服务器的
class SchoolJobFindApplicationTests {


    @Autowired
    private JobService jobService;

    @Test
    public void test(){
        QueryWrapper jobQueryWrapper = new QueryWrapper<Job>();
        jobQueryWrapper.eq("jid",Long.parseLong("3"));
        System.out.println(jobService.getOne(jobQueryWrapper));
    }
}
