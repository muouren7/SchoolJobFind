package com.example.schooljobfind.Common.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.schooljobfind.Common.Mapper.ResultMapper;
import com.example.schooljobfind.Common.Service.ResultService;
import com.example.schooljobfind.Common.entity.Result;
import org.springframework.stereotype.Service;

/**
 * 录取结果表(Result)表服务实现类
 *
 * @author makejava
 * @since 2023-04-09 17:36:58
 */
@Service("resultService")
public class ResultServiceImpl extends ServiceImpl<ResultMapper, Result> implements ResultService {

}

