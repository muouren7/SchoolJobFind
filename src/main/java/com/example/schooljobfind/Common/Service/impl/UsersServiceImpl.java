package com.example.schooljobfind.Common.Service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.schooljobfind.Common.Mapper.UsersMapper;
import com.example.schooljobfind.Common.Service.UsersService;
import com.example.schooljobfind.Common.entity.Users;
import org.springframework.stereotype.Service;

/**
 * 用户表(Users)表服务实现类
 *
 * @author makejava
 * @since 2023-03-28 16:47:28
 */
@Service("usersService")
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

    @Override
    public Boolean test() {
        return null;
    }
}

