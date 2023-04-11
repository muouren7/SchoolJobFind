package com.example.schooljobfind.Common.controller;

import com.example.schooljobfind.Common.Resp.Result;
import com.example.schooljobfind.Common.Service.InterviewService;
import com.example.schooljobfind.Common.entity.vo.InterViewVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InterViewController {

    @Autowired
    private InterviewService interviewService;

    @RequestMapping("/InterView/addInterView")
    @ResponseBody
    public Result<InterViewVo> addInterView(@RequestBody InterViewVo vo){
        return interviewService.addInterView(vo);
    }
}
