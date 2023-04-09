package com.example.schooljobfind.Common.entity;

import java.util.Date;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 面试邀约表(Interview)表实体类
 *
 * @author makejava
 * @since 2023-04-09 17:35:57
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("interview")
public class Interview  {
    //面试编号@TableId
    private Long fid;

    //学生编号
    private Long sid;
    //企业用户编号
    private Long bid;
    //职位编号
    private Long jid;
    //面试时间
    private Date ftime;
    //是否被接受
//0：表示未被接受
//1：表示已经接受
    private Integer isaccept;
    //面试地址
    private String addr;
    //逻辑删除
//0：表示未被删除
//1：表示被删除
    private Integer deleted;



}
