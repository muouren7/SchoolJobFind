package com.example.schooljobfind.Common.entity;


import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * (Company)表实体类
 *
 * @author makejava
 * @since 2023-04-09 17:35:08
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("company")
public class Company  {
    //公司编号@TableId
    @TableId(value="cid",type = IdType.AUTO)
    private Long cid;

    //公司名称
    private String name;
    //简介
    private String cdesc;
    //地址
    private String addr;
    //电话
    private String phone;
    //规模
    private String scale;
    //老板姓名
    private String cname;



}
