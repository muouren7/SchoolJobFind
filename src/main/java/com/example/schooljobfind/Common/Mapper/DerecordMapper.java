package com.example.schooljobfind.Common.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.schooljobfind.Common.entity.Derecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


/**
 * 投递简历表(Derecord)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-09 17:35:39
 */
@Mapper
public interface DerecordMapper extends BaseMapper<Derecord> {


}
