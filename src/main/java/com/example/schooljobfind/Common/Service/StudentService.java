package com.example.schooljobfind.Common.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.schooljobfind.Common.Resp.Result;
import com.example.schooljobfind.Common.entity.Student;
import com.example.schooljobfind.Common.entity.dio.Studentdio;
import com.example.schooljobfind.Common.entity.vo.StudentVo;


/**
 * 学生表(Student)表服务接口
 *
 * @author makejava
 * @since 2023-04-09 17:33:02
 */
public interface StudentService extends IService<Student> {

    Result<StudentVo> getstuinfo(StudentVo s);

    Result<StudentVo> updateInfo(Studentdio s);
}
