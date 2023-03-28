package com.example.schooljobfind.Common.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.schooljobfind.Common.entity.Users;
import org.apache.ibatis.annotations.Mapper;


/**
 * 用户表(Users)表数据库访问层
 *
 * @author makejava
 * @since 2023-03-28 16:47:31
 */
@Mapper
public interface UsersMapper extends BaseMapper<Users> {

}
