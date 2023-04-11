package com.example.schooljobfind.Common.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeVo {
    private String rid;

    //姓名
    private String name;
    //性别
    private Integer sex;
    //头像地址
    private String profile;
    //出生日期
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birth;
    //电话
    private String phone;
    //电子邮件
    private String email;
    //居住地址
    private String addr;
    //工作经验
    private String exp;
    //教育经历
    private String edu;
    //专业技能
    private String preskill;
    //自我评价
    private String selfeva;
    //简历附件地址
    private String reurl;
    //备注
    private String remark;

    private String sid;
}
