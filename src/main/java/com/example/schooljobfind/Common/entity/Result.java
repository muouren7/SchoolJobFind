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
 * 录取结果表(Result)表实体类
 *
 * @author makejava
 * @since 2023-04-09 17:36:58
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("result")
public class Result  {
    //录取记录编号@TableId
    @TableId(value="id",type = IdType.AUTO)
    private Long id;

    //面试邀约编号
    private Long fid;
    //是否录取
//0：表示未被录取
//1：表示被录取
    private Integer isaccept;
    //结果信息
    private String msg;
    //时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;
    //逻辑删除
//0：表示未被删除
//1：表示被删除
    private Integer deleted;



}
