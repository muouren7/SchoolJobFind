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
 * 轮播图表(Rotation)表实体类
 *
 * @author makejava
 * @since 2023-04-09 17:37:36
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("rotation")
public class Rotation  {
    //记录id@TableId
    @TableId(value="id",type = IdType.AUTO)
    private Long id;

    //图片url地址
    private String url;
    //是否展示
//0：表示不展示
//1：表示展示
    private Integer isshow;
    //创建时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ctime;



}
