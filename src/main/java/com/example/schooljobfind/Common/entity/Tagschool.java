package com.example.schooljobfind.Common.entity;


import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 学校标签表(Tagschool)表实体类
 *
 * @author makejava
 * @since 2023-04-09 17:38:04
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tagschool")
public class Tagschool  {
    //记录编号@TableId
    @TableId(value="tsid",type = IdType.AUTO)
    private Integer tsid;

    //学校名称
    private String tname;
    //级别
    private String trank;



}
