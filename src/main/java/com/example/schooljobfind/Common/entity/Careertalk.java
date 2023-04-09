package com.example.schooljobfind.Common.entity;

import java.util.Date;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 双选会信息表(Careertalk)表实体类
 *
 * @author makejava
 * @since 2023-04-09 17:34:19
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("careertalk")
public class Careertalk  {
    //双选会编号@TableId
    private Long id;

    //双选会名称
    private String title;
    //举办时间
    private Date time;
    //举办地址
    private String addr;
    //创建时间
    private Date ctime;
    //学校
    private String school;
    //主题
    private String theme;
    //描述
    private String desc;
    //逻辑删除
//0：表示未被删除
//1：表示被删除
    private Integer deleted;



}
