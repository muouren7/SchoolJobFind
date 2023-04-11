package com.example.schooljobfind.Common.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterViewVo {
    private String fid;

    //学生编号
    private String sid;
    //企业用户编号
    private String bid;
    //职位编号
    private String jid;
    //面试时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
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
