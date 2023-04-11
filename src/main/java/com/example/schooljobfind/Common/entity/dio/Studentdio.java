package com.example.schooljobfind.Common.entity.dio;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Studentdio {
    private String sid;
    //姓名
    private String name;
    //性别
    private Integer sex;
    //出生日期
    private Date birth;
    //电话
    private String phone;
    //居住地址
    private String addr;
    //头像地址
    private String profile;
    //求职状态
//0：表示求职
//1：表示非求职
    private Integer status;
    //学校标签id
    private Integer tsid;
    //大学专业
    private String subject;
    //备注
    private String remark;
    //是否被冻结
//0：表示未被冻结
//1：表示被冻结
    private Integer freeze;
    private String grade;
}
