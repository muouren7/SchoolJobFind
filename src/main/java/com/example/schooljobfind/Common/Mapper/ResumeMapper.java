package com.example.schooljobfind.Common.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.schooljobfind.Common.entity.Resume;
import org.apache.ibatis.annotations.Mapper;


/**
 * 简历表(Resume)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-09 17:37:16
 */
@Mapper
public interface ResumeMapper extends BaseMapper<Resume> {

}
