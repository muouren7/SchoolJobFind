package com.example.schooljobfind.Common.Service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.schooljobfind.Common.Mapper.DerecordMapper;
import com.example.schooljobfind.Common.Resp.Result;
import com.example.schooljobfind.Common.Resp.ResultList;
import com.example.schooljobfind.Common.Service.*;
import com.example.schooljobfind.Common.entity.*;
import com.example.schooljobfind.Common.entity.vo.DerecordVo;
import com.example.schooljobfind.Common.entity.vo.SDerecordVo;
import com.example.schooljobfind.Common.entity.vo.UsersVo;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 投递简历表(Derecord)表服务实现类
 *
 * @author makejava
 * @since 2023-04-09 17:35:39
 */
@Service("derecordService")
public class DerecordServiceImpl extends ServiceImpl<DerecordMapper, Derecord> implements DerecordService {

    @Autowired
    private BossService bossService;
    @Autowired
    private ResumeService resumeService;
    @Autowired
    private JobService jobService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private CompanyService companyService;

    @Override
    public Result<DerecordVo> senddercord(DerecordVo vo) {
        //获取职位信息
        QueryWrapper jobQueryWrapper = new QueryWrapper<Job>();
        jobQueryWrapper.eq("jid",Long.parseLong(vo.getJid()));
        Job job = jobService.getOne(jobQueryWrapper);
        //获取企业用户信息
        QueryWrapper bossQueryWrapper = new QueryWrapper<Boss>();
        bossQueryWrapper.eq("bid", job.getBid());
        Boss boss = bossService.getOne(bossQueryWrapper);
        //获取简历信息
        QueryWrapper resumeQueryWrapper = new QueryWrapper<Resume>();
        resumeQueryWrapper.eq("sid",Long.parseLong(vo.getSid()));
        Resume resume = resumeService.getOne(resumeQueryWrapper);

        Derecord derecord = new Derecord(Long.valueOf(0),resume.getSid(),boss.getBid(),job.getJid(),new Date(),0,resume.getRid(),resume.getReurl(),0);
        DerecordVo derecordVo = new DerecordVo("",vo.getSid(),String.valueOf(boss.getBid()),String.valueOf(job.getJid()),new Date(),Integer.valueOf(0),String.valueOf(resume.getRid()),resume.getReurl(),Integer.valueOf(0));
        if(save(derecord)){
            derecordVo.setDid(String.valueOf(derecord.getDid()));
            return new Result<>(200,"投递成功",derecordVo);
        }else{
            return new Result<>(500,"投递失败");
        }

    }

    @Override
    public ResultList<SDerecordVo> getmyderecord(UsersVo vo) {
        System.out.println(vo);
//        return new ResultList<SDerecordVo>(300,"调试",null);
        List<SDerecordVo> list = null;
        //获取该用户的信息
        //判断是学生还是企业
        QueryWrapper bossQueryWrapper = new QueryWrapper<Boss>();
        QueryWrapper companyQueryWrapper = new QueryWrapper<Company>();
        QueryWrapper resumeQueryWrapper = new QueryWrapper<Resume>();
        QueryWrapper jobQueryWrapper = new QueryWrapper<Job>();
        QueryWrapper studentQueryWrapper = new QueryWrapper<Student>();
        if(vo.getRole() == 1){  //是学生
            studentQueryWrapper.eq("sid",Long.parseLong(vo.getId()));
            Student student = studentService.getOne(studentQueryWrapper);
            System.out.println(student);
            QueryWrapper derecordQueryWrapper = new QueryWrapper<Derecord>();
            derecordQueryWrapper.eq("sid",student.getSid());
            List<Derecord> list1 = list(derecordQueryWrapper);
            System.out.println("投递记录个数为"+list1.size());
            if(list1.size() == 0){
                return new ResultList<SDerecordVo>(300,"您当前为投递任何职位",null);
            }
            list = list1.stream()
                    .map((e)->{
                        studentQueryWrapper.clear();
                        bossQueryWrapper.clear();
                        resumeQueryWrapper.clear();
                        companyQueryWrapper.clear();
                        jobQueryWrapper.clear();
                        bossQueryWrapper.eq("bid",e.getBid());
                        resumeQueryWrapper.eq("rid",e.getRid());
                        Boss boss = bossService.getOne(bossQueryWrapper);
                        Resume resume = resumeService.getOne(resumeQueryWrapper);
                        companyQueryWrapper.eq("cid",boss.getCid());
                        Company company = companyService.getOne(companyQueryWrapper);
                        jobQueryWrapper.eq("jid",e.getJid());
                        Job job = jobService.getOne(jobQueryWrapper);
//                        System.out.println(e);
//                        System.out.println(boss);
//                        System.out.println(company);
//                        System.out.println(job);
                        return new SDerecordVo(resume.getName(),boss.getName(),company.getName(),job.getTitle(),e.getDtime(),e.getReurl(),String.valueOf(student.getSid()),String.valueOf(boss.getBid()),String.valueOf(job.getJid()),e.getIsaccept());
                    }).collect(Collectors.toList());
        }else{


            bossQueryWrapper.eq("bid",Long.parseLong(vo.getId()));
            Boss boss = bossService.getOne(bossQueryWrapper);
            QueryWrapper derecordQueryWrapper = new QueryWrapper<Derecord>();
            derecordQueryWrapper.eq("bid",boss.getBid());
            List<Derecord> list1 = list(derecordQueryWrapper);
            if(list1.size() == 0){
                return new ResultList<SDerecordVo>(300,"您当前为投递任何职位",null);
            }
            list = list1.stream()
                    .map((e)->{
                        studentQueryWrapper.clear();
                        bossQueryWrapper.clear();
                        resumeQueryWrapper.clear();
                        companyQueryWrapper.clear();
                        jobQueryWrapper.clear();
                        studentQueryWrapper.eq("sid",e.getSid());
                        Student student = studentService.getOne(studentQueryWrapper);
                        resumeQueryWrapper.eq("rid",e.getRid());

                        Resume resume = resumeService.getOne(resumeQueryWrapper);
                        companyQueryWrapper.eq("cid",boss.getCid());
                        Company company = companyService.getOne(companyQueryWrapper);
                        jobQueryWrapper.eq("jid",e.getJid());
                        Job job = jobService.getOne(jobQueryWrapper);
                        return new SDerecordVo(resume.getName(),boss.getName(),company.getName(),job.getTitle(),e.getDtime(),e.getReurl(),String.valueOf(student.getSid()),String.valueOf(boss.getBid()),String.valueOf(job.getJid()),e.getIsaccept());
                    }).collect(Collectors.toList());
        }
        return new ResultList<SDerecordVo>(200,"获取成功",list);
    }
}

