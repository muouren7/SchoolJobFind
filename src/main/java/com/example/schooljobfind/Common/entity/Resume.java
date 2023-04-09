package com.example.schooljobfind.Common.entity;

import java.util.Date;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 简历表(Resume)表实体类
 *
 * @author makejava
 * @since 2023-04-09 17:37:16
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("resume")
public class Resume  {
    //简历id@TableId
    private Long rid;

    //姓名
    private String name;
    //性别
    private Integer sex;
    //头像地址
    private String profile;
    //出生日期
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
    
    private Long sid;



}
