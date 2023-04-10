package com.example.schooljobfind.Common.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.schooljobfind.Common.entity.Interview;
import org.apache.ibatis.annotations.Mapper;


/**
 * 面试邀约表(Interview)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-09 17:35:57
 */
@Mapper
public interface InterviewMapper extends BaseMapper<Interview> {

}
