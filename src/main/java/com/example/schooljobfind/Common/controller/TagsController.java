package com.example.schooljobfind.Common.controller;

import com.example.schooljobfind.Common.Resp.ResultList;
import com.example.schooljobfind.Common.Service.TagschoolService;
import com.example.schooljobfind.Common.entity.Tagschool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TagsController {

    @Autowired
    private TagschoolService service;

    @RequestMapping("/tags/getschools")
    @ResponseBody
    public ResultList<Tagschool> getSchools(){
        List<Tagschool> list = service.list(null);
        return new ResultList<>(200, "获取成功", list);
    }
}
