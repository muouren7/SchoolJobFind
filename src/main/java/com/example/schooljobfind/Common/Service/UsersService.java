package com.example.schooljobfind.Common.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.schooljobfind.Common.entity.Users;


/**
 * 用户表(Users)表服务接口
 *
 * @author makejava
 * @since 2023-03-28 16:47:25
 */
public interface UsersService extends IService<Users> {
    Boolean test();
}
