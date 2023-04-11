package com.example.schooljobfind.Common.entity.dio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usersdio {
    private String uid;

    //用户名
    private String username;
    //密码
    private String oldpwd;
    private String newpwd;
    //用户角色
//0：表示学生
//1：表示企业用户
//2：表示管理员
    private Integer role;
    //用户对应角色的外部id
    private String id;
}
