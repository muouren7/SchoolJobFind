package com.example.schooljobfind.Common.Service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.schooljobfind.Common.Mapper.JobMapper;
import com.example.schooljobfind.Common.Resp.Result;
import com.example.schooljobfind.Common.Resp.ResultList;
import com.example.schooljobfind.Common.Service.JobService;
import com.example.schooljobfind.Common.entity.Job;
import com.example.schooljobfind.Common.entity.Users;
import com.example.schooljobfind.Common.entity.vo.JobVo;
import com.example.schooljobfind.Common.entity.vo.UsersVo;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 职位表(Job)表服务实现类
 *
 * @author makejava
 * @since 2023-04-09 17:36:45
 */
@Service("jobService")
public class JobServiceImpl extends ServiceImpl<JobMapper, Job> implements JobService {


    @Override
    public Result<JobVo> addJob(JobVo vo) {
        //System.out.println(vo);
        Job job = new Job(Long.parseLong("0"),vo.getTitle(),vo.getJdesc(),new Date(),vo.getStatus(),vo.getMinpay(),vo.getMaxpay(),vo.getBif(),vo.getReq(),vo.getCout(),vo.getRemark(),Long.parseLong(vo.getBid()),Long.parseLong(vo.getCid()),vo.getAddr(),vo.getX(),vo.getY(),vo.getDeleted(),Long.parseLong(vo.getCuid()));
//        System.out.println(job);
        if(save(job)){
            return new Result<JobVo>(200,"发布成功",vo);
        }else{
            return new Result<>(500,"发布失败");
        }
    }

    @Override
    public ResultList<JobVo> getBossJob(UsersVo u) {
        QueryWrapper queryWrapper = new QueryWrapper<Job>();
        queryWrapper.eq("bid",Long.parseLong(u.getId()));
        List<Job> list = list(queryWrapper);
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<JobVo> collect = list.stream()
                .map(e -> {
                   return new JobVo(String.valueOf(e.getJid()), e.getTitle(), e.getJdesc(), f.format(e.getCreatetime()), e.getStatus(), e.getMinpay(), e.getMaxpay(), e.getBif(), e.getReq(), e.getCout(), e.getRemark(), String.valueOf(e.getBid()), String.valueOf(e.getCid()), e.getAddr(), e.getX(), e.getY(), e.getDeleted(), String.valueOf(e.getCuid()));
                }).collect(Collectors.toList());
        return new ResultList<>(200,"获取成功",collect);
    }

    @Override
    public ResultList<JobVo> search(String key) {
        QueryWrapper jobQueryWrapper = new QueryWrapper<Job>();
        jobQueryWrapper.like("title",key);
        jobQueryWrapper.or();
        jobQueryWrapper.like("jdesc",key);
        jobQueryWrapper.or();
        jobQueryWrapper.like("bif",key);
        jobQueryWrapper.or();
        jobQueryWrapper.like("req",key);
        jobQueryWrapper.or();
        jobQueryWrapper.like("addr",key);
        List<Job> list = list(jobQueryWrapper);
        List<JobVo>list1 = list.stream()
                .map((e)->{
                    return new JobVo(String.valueOf(e.getJid()),e.getTitle(),e.getJdesc(),e.getCreatetime().toString(),e.getStatus(),e.getMinpay(),e.getMaxpay(),e.getBif(),e.getReq(),e.getCout(),e.getRemark(),String.valueOf(e.getBid()),String.valueOf(e.getCid()),e.getAddr(),e.getX(),e.getY(),e.getDeleted(),String.valueOf(e.getCuid()));
                }).collect(Collectors.toList());
        if(list1.size() == 0){
            return new ResultList<JobVo>(300,"暂未搜索到任何记录",null);
        }
        return new ResultList<JobVo>(200,"搜索成功",list1);
    }
}

