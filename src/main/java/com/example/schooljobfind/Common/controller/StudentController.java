package com.example.schooljobfind.Common.controller;

import com.example.schooljobfind.Common.Resp.Result;
import com.example.schooljobfind.Common.Service.StudentService;
import com.example.schooljobfind.Common.entity.Student;
import com.example.schooljobfind.Common.entity.dio.Studentdio;
import com.example.schooljobfind.Common.entity.vo.StudentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/Student/getstuinfo")
    @ResponseBody
    public Result<StudentVo> getstuinfo(@RequestBody StudentVo s){
        return studentService.getstuinfo(s);
    }

    @RequestMapping("/Student/updateInfo")
    @ResponseBody
    public Result<StudentVo> updateInfo(@RequestBody Studentdio s){
        return studentService.updateInfo(s);
    }
}
