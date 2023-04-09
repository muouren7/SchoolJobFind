package com.example.schooljobfind.Common.entity;

import java.util.Date;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 职位表(Job)表实体类
 *
 * @author makejava
 * @since 2023-04-09 17:36:45
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("job")
public class Job  {
    //职位编号@TableId
    private Long jid;

    //职位名称
    private String title;
    //描述
    private String desc;
    //发布时间
    private Date createtime;
    //职位状态
//0：表示招聘中
//1：表示停止招聘
    private Integer status;
    //最低薪资单位元
    private String minpay;
    //最高薪资单位元
    private String maxpay;
    //福利待遇
    private String bif;
    //职位要求
    private String req;
    //招聘人数
    private Integer cout;
    //备注
    private String remark;
    //企业用户发布者id
    private Long bid;
    //公司编号
    private Long cid;
    //工作地点地址
    private String addr;
    //经纬度x
    private Float x;
    //经纬度Y
    private Float y;
    //逻辑删除
//0：表示未删除
//1：表示删除
    private Integer deleted;
    //所属城市id
    private Long cuit;



}
