package com.example.schooljobfind.Common.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.schooljobfind.Common.entity.Job;
import org.apache.ibatis.annotations.Mapper;


/**
 * 职位表(Job)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-09 17:36:45
 */
@Mapper
public interface JobMapper extends BaseMapper<Job> {

}
