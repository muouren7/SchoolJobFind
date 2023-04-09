package com.example.schooljobfind.Common.entity;

import java.util.Date;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 学生表(Student)表实体类
 *
 * @author makejava
 * @since 2023-04-09 17:33:02
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("student")
public class Student  {
    //学生id  @TableId
    private Long sid;

    //姓名
    private String name;
    //性别  
//0：男
//1：女
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
    private Long tsid;
    //大学专业
    private String subject;
    //备注
    private String remark;
    //是否被冻结
//0：表示未被冻结
//1：表示被冻结
    private Integer freeze;



}
