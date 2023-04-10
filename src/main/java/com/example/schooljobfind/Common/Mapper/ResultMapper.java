package com.example.schooljobfind.Common.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.schooljobfind.Common.entity.Result;
import org.apache.ibatis.annotations.Mapper;


/**
 * 录取结果表(Result)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-09 17:36:58
 */
@Mapper
public interface ResultMapper extends BaseMapper<Result> {

}
