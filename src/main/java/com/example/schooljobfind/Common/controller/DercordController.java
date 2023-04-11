package com.example.schooljobfind.Common.controller;

import com.example.schooljobfind.Common.Resp.Result;
import com.example.schooljobfind.Common.Resp.ResultList;
import com.example.schooljobfind.Common.Service.DerecordService;
import com.example.schooljobfind.Common.entity.vo.DerecordVo;
import com.example.schooljobfind.Common.entity.vo.SDerecordVo;
import com.example.schooljobfind.Common.entity.vo.UsersVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DercordController {

    @Autowired
    private DerecordService derecordService;

    //投递简历
    @RequestMapping("/Dercord/senddercord")
    @ResponseBody
    public Result<DerecordVo> senddercord(@RequestBody DerecordVo vo){
        return derecordService.senddercord(vo);
    }

    //获取某一学生的投递记录
    @RequestMapping("/Derord/getmyderecord")
    @ResponseBody
    public ResultList<SDerecordVo> getmyderecord(@RequestBody UsersVo vo){
        return derecordService.getmyderecord(vo);
    }
}
