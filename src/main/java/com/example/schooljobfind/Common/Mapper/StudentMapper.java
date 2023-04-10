package com.example.schooljobfind.Common.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.schooljobfind.Common.entity.Student;
import org.apache.ibatis.annotations.Mapper;


/**
 * 学生表(Student)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-09 17:33:02
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}
