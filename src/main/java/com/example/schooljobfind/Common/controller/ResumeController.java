package com.example.schooljobfind.Common.controller;

import com.example.schooljobfind.Common.Resp.Result;
import com.example.schooljobfind.Common.Service.ResumeService;
import com.example.schooljobfind.Common.entity.Resume;
import com.example.schooljobfind.Common.entity.vo.ResumeVo;
import com.example.schooljobfind.Common.entity.vo.UsersVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @RequestMapping("/Resume/myre")
    @ResponseBody
    public Result<ResumeVo> myre(@RequestBody UsersVo u){
        return resumeService.getmyre(u);
    }

    @RequestMapping("/Resum/updateResume")
    @ResponseBody
    public Result<ResumeVo> updateResume(@RequestBody ResumeVo resumeVo){
        return resumeService.updateResume(resumeVo);
    }
}
