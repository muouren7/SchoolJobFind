package com.example.schooljobfind.Common.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.schooljobfind.Common.Resp.Result;
import com.example.schooljobfind.Common.Resp.ResultList;
import com.example.schooljobfind.Common.entity.Derecord;
import com.example.schooljobfind.Common.entity.vo.DerecordVo;
import com.example.schooljobfind.Common.entity.vo.SDerecordVo;
import com.example.schooljobfind.Common.entity.vo.UsersVo;


/**
 * 投递简历表(Derecord)表服务接口
 *
 * @author makejava
 * @since 2023-04-09 17:35:39
 */
public interface DerecordService extends IService<Derecord> {

    Result<DerecordVo> senddercord(DerecordVo vo);

    ResultList<SDerecordVo> getmyderecord(UsersVo vo);
}
