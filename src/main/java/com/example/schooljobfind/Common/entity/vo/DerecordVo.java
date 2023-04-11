package com.example.schooljobfind.Common.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DerecordVo {
    private String did;

    //学生编号
    private String sid;
    //企业用户编号
    private String bid;
    //职位编号
    private String jid;
    //投递时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dtime;
    //是否被接受
//0：表示未被接受
//1：表示被接受
    private Integer isaccept;
    //简历编号
    private String rid;
    //简历附件url地址
    private String reurl;
    //逻辑删除
//0：表示未被删除
//1：表示被删除
    private Integer deleted;
}
