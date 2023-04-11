package com.example.schooljobfind.Common.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.schooljobfind.Common.Resp.Result;
import com.example.schooljobfind.Common.Service.BossService;
import com.example.schooljobfind.Common.Service.ResumeService;
import com.example.schooljobfind.Common.Service.StudentService;
import com.example.schooljobfind.Common.Service.UsersService;
import com.example.schooljobfind.Common.entity.Boss;
import com.example.schooljobfind.Common.entity.Resume;
import com.example.schooljobfind.Common.entity.Student;
import com.example.schooljobfind.Common.entity.Users;
import com.example.schooljobfind.Common.entity.dio.Usersdio;
import com.example.schooljobfind.Common.entity.vo.UsersVo;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UsersService usersService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private BossService bossService;
    @Autowired
    private ResumeService resumeService;


    @PostMapping("/User/regisin")
    @ResponseBody
    public Result<String> regisin(@RequestBody Users user){
        Resume resume = new Resume();
        Student student = new Student();
        student.setBirth(new Date());
        Boss boss = new Boss();
        boss.setBirth(new Date());
        QueryWrapper uW = new QueryWrapper<Users>();
        uW.eq("username",user.getUsername());
        uW.eq("role",user.getRole());
        List<Users> one = usersService.list(uW);
        if(one.size() >= 1){
            return new Result<>(500,"该用户已经存在");
        }
        if(user.getRole() == 1){
           studentService.save(student);

            System.out.println("学生id是"+student.getSid());
            user.setId(student.getSid());
            if(usersService.save(user)){
                resume.setSid(student.getSid());
                resumeService.save(resume);
                return new Result<>(200,"注册成功");
            }else{
                return new Result<>(500,"失败");
            }
        }else if(user.getRole() == 2){
            bossService.save(boss);
            System.out.println("企业用户id是"+boss.getBid());
            user.setId(boss.getBid());
            if(usersService.save(user)){
                return new Result<>(200,"注册成功");
            }else{
                return new Result<>(500,"失败");
            }
        }

        return null;
    }

    @PostMapping("/User/login")
    @ResponseBody
    public Result<UsersVo> login(@RequestBody Users user){
        return usersService.login(user);
    }

    @PostMapping("/Users/updatePwd")
    @ResponseBody
    public Result<UsersVo> updatePwd(@RequestBody Usersdio usersdio){
        return usersService.updatePwd(usersdio);
    }
}
