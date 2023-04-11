package com.example.schooljobfind.Common.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.schooljobfind.Common.Mapper.TagschoolMapper;
import com.example.schooljobfind.Common.Service.TagschoolService;
import com.example.schooljobfind.Common.entity.Tagschool;
import org.springframework.stereotype.Service;

/**
 * 学校标签表(Tagschool)表服务实现类
 *
 * @author makejava
 * @since 2023-04-09 17:38:04
 */
@Service("tagschoolService")
public class TagschoolServiceImpl extends ServiceImpl<TagschoolMapper, Tagschool> implements TagschoolService {

}

