package com.example.schooljobfind.Common.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.schooljobfind.Common.Resp.Result;
import com.example.schooljobfind.Common.entity.Resume;
import com.example.schooljobfind.Common.entity.dio.Usersdio;
import com.example.schooljobfind.Common.entity.vo.ResumeVo;
import com.example.schooljobfind.Common.entity.vo.UsersVo;


/**
 * 简历表(Resume)表服务接口
 *
 * @author makejava
 * @since 2023-04-09 17:37:16
 */
public interface ResumeService extends IService<Resume> {

    Result<ResumeVo> getmyre(UsersVo u);

    Result<ResumeVo> updateResume(ResumeVo resumeVo);
}
