package com.example.schooljobfind.Common.Service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.schooljobfind.Common.Mapper.UsersMapper;
import com.example.schooljobfind.Common.Resp.Result;
import com.example.schooljobfind.Common.Service.UsersService;
import com.example.schooljobfind.Common.Utils.BeanCopyUtils;
import com.example.schooljobfind.Common.Utils.Token;
import com.example.schooljobfind.Common.entity.Users;
import com.example.schooljobfind.Common.entity.dio.Usersdio;
import com.example.schooljobfind.Common.entity.vo.UsersVo;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public Result<UsersVo> login(Users user) {
        QueryWrapper<Users> wrapper = new QueryWrapper<Users>();
        wrapper.eq("username",user.getUsername());
        wrapper.eq("pwd",user.getPwd());
        wrapper.eq("role",user.getRole());
        List<Users> list = list(wrapper);
        if(list.size() == 0){
            return new Result<>(500,"登录失败");
        }else{
            Users u = list.get(0);
            String token = new Token().createToken(u.getUid()+";"+u.getUsername()+";"+u.getRole()+";"+u.getId());
            u.setPwd("");
            UsersVo usersVo = new UsersVo(String.valueOf(u.getUid()),u.getUsername(),u.getPwd(),u.getRole(),String.valueOf(u.getId()));
            return new Result<UsersVo>(200,token,usersVo);
        }

    }

    @Override
    public Result<UsersVo> updatePwd(Usersdio usersdio) {
        QueryWrapper queryWrapper = new QueryWrapper<Users>();
        queryWrapper.eq("uid",Long.parseLong(usersdio.getUid()));
        Users u = new Users();
        u = getOne(queryWrapper);
        if( !u.getPwd().equals(usersdio.getOldpwd())){
            return new Result<>(500,"原密码输入错误");
        }else{
            UpdateWrapper updateWrapper = new UpdateWrapper<Users>();
            updateWrapper.eq("uid",Long.parseLong(usersdio.getUid()));
            updateWrapper.set("pwd",usersdio.getNewpwd());
            update(updateWrapper);
            return new Result<>(200,"修改成功");
        }
    }
}

