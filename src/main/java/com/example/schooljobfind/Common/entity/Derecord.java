package com.example.schooljobfind.Common.entity;

import java.util.Date;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 投递简历表(Derecord)表实体类
 *
 * @author makejava
 * @since 2023-04-09 17:35:39
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("derecord")
public class Derecord  {
    //投递编号@TableId
    private Long did;

    //学生编号
    private Long sid;
    //企业用户编号
    private Long bid;
    //职位编号
    private Long jid;
    //投递时间
    private Date dtime;
    //是否被接受
//0：表示未被接受
//1：表示被接受
    private Integer isaccept;
    //简历编号
    private Long rid;
    //简历附件url地址
    private String reurl;
    //逻辑删除
//0：表示未被删除
//1：表示被删除
    private Integer deleted;



}
