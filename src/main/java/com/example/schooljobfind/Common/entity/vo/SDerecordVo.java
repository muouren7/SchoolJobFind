package com.example.schooljobfind.Common.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SDerecordVo {
    private String sname;//学生姓名
    private String bname;//企业联系人
    private String cname;//公司名称
    private String title;//职位名称
    private Date date;
    private String reurl;//简历附件地址
    private String sid;
    private String bid;
    private String jid;
    private Integer isaccept;   //是否接受
}
