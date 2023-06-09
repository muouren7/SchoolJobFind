package com.example.schooljobfind.Common.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.schooljobfind.Common.entity.Boss;
import org.apache.ibatis.annotations.Mapper;


/**
 * 企业用户表(Boss)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-09 17:34:00
 */
@Mapper
public interface BossMapper extends BaseMapper<Boss> {

}
