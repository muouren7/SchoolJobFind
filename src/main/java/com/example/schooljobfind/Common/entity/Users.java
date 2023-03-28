package com.example.schooljobfind.Common.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 用户表(Users)表实体类
 *
 * @author makejava
 * @since 2023-03-28 16:47:22
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("users")
public class Users  {
    //用户编号@TableId
    private Long uid;

    //用户名
    private String username;
    //密码
    private String pwd;
    //用户角色
//0：表示学生
//1：表示企业用户
//2：表示管理员
    private Integer role;
    //用户对应角色的外部id
    private Long id;



}
