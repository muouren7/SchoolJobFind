package com.example.schooljobfind.Common.Service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.schooljobfind.Common.Mapper.TagscityMapper;
import com.example.schooljobfind.Common.Service.TagscityService;
import com.example.schooljobfind.Common.entity.Tagscity;
import org.springframework.stereotype.Service;

/**
 * 城市标签表(Tagscity)表服务实现类
 *
 * @author makejava
 * @since 2023-04-09 17:38:17
 */
@Service("tagscityService")
public class TagscityServiceImpl extends ServiceImpl<TagscityMapper, Tagscity> implements TagscityService {
    @Override
    public Boolean test() {
        return null;
    }
}

