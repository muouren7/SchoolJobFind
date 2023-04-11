package com.example.schooljobfind.Common.entity;

import java.util.Date;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 企业用户表(Boss)表实体类
 *
 * @author makejava
 * @since 2023-04-09 17:33:59
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("boss")
public class Boss  {
    //企业用户id@TableId
    @TableId(value="bid",type = IdType.AUTO)
    private Long bid;

    //姓名
    private String name;
    //生日
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birth;
    //电话
    private String phone;
    //头像url地址
    private String profile;
    //备注
    private String remark;
    //公司id\n刚注册时为0
    private Long cid;
    //是否冻结
//0：表示未被冻结
//1：表示被冻结
    private Integer freeze;



}
