package com.example.schooljobfind.Common.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.schooljobfind.Common.Resp.Result;
import com.example.schooljobfind.Common.entity.Users;
import com.example.schooljobfind.Common.entity.dio.Usersdio;
import com.example.schooljobfind.Common.entity.vo.UsersVo;


/**
 * 用户表(Users)表服务接口
 *
 * @author makejava
 * @since 2023-03-28 16:47:25
 */
public interface UsersService extends IService<Users> {
    Boolean test();

    Result<UsersVo> login(Users user);

    Result<UsersVo> updatePwd(Usersdio usersdio);
}
