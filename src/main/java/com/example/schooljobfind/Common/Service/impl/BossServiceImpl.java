package com.example.schooljobfind.Common.Service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.schooljobfind.Common.Mapper.BossMapper;
import com.example.schooljobfind.Common.Service.BossService;
import com.example.schooljobfind.Common.entity.Boss;
import org.springframework.stereotype.Service;

/**
 * 企业用户表(Boss)表服务实现类
 *
 * @author makejava
 * @since 2023-04-09 17:34:00
 */
@Service("bossService")
public class BossServiceImpl extends ServiceImpl<BossMapper, Boss> implements BossService {
    @Override
    public Boolean test() {
        return null;
    }
}

