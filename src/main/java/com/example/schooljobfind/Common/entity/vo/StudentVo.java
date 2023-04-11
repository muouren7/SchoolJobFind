package com.example.schooljobfind.Common.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentVo {
    private String sid;

    //姓名
    private String name;
    //性别
//0：男
//1：女
    private Integer sex;
    //出生日期
    private String birth;
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
