package com.example.schooljobfind.Common.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.schooljobfind.Common.Mapper.CompanyMapper;
import com.example.schooljobfind.Common.Service.CompanyService;
import com.example.schooljobfind.Common.entity.Company;
import org.springframework.stereotype.Service;

/**
 * (Company)表服务实现类
 *
 * @author makejava
 * @since 2023-04-09 17:35:08
 */
@Service("companyService")
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements CompanyService {

}

