package com.ldgroup.easycodedemo.service.impl;

import com.ldgroup.easycodedemo.entity.Job;
import com.ldgroup.easycodedemo.dao.mapper.JobDao;
import com.ldgroup.easycodedemo.service.JobService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * 岗位(Job)表服务实现类
 *
 * @author makejava
 * @since 2020-06-28 14:35:58
 */
@Service("jobService")
@Slf4j
public class JobServiceImpl implements JobService {
    @Resource
    private JobDao jobDao;

    @Override
    public List<Job> selectJobsByCondition(String id){
        List<Job> jobList = null;
        try {
            Example example = new Example(Job.class);
            example.createCriteria().andEqualTo("id",id);
            example.setOrderByClause("create_time desc");
            jobList = jobDao.selectByExample(example);
        }catch (Exception e){
            log.error("数据库操作错误,id:{},{}",id,e.toString());
        }
        if (CollectionUtils.isEmpty(jobList)){
            log.error("按id:{} 查询，数据库中无数据！",id);
        }
        return jobList;
    }


    @Override
    public List<Job> selectAllJobs() {
        return jobDao.selectAllJobs();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Job queryById(String id) {
        return this.jobDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Job> queryAllByLimit(int offset, int limit) {
        return this.jobDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param job 实例对象
     * @return 实例对象
     */
    @Override
    public Job insert(Job job) {
        this.jobDao.insert(job);
        return job;
    }

    /**
     * 修改数据
     *
     * @param job 实例对象
     * @return 实例对象
     */
    @Override
    public Job update(Job job) {
        this.jobDao.update(job);
        return this.queryById(job.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.jobDao.deleteById(id) > 0;
    }
}