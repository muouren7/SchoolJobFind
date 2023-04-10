package com.example.schooljobfind.Common.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.schooljobfind.Common.Mapper.RotationMapper;
import com.example.schooljobfind.Common.Service.RotationService;
import com.example.schooljobfind.Common.entity.Rotation;
import org.springframework.stereotype.Service;

/**
 * 轮播图表(Rotation)表服务实现类
 *
 * @author makejava
 * @since 2023-04-09 17:37:36
 */
@Service("rotationService")
public class RotationServiceImpl extends ServiceImpl<RotationMapper, Rotation> implements RotationService {

}

