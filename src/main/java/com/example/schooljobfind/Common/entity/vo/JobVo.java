package com.example.schooljobfind.Common.entity.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobVo {
    @JsonProperty("jid")
    private String jid;

    //职位名称
    private String title;
    //描述
    private String jdesc;
    //发布时间
    private String createtime;
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
    private String bid;
    //公司编号
    private String cid;
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
    private String cuid;
}
