package com.ldgroup.easycodedemo.service;

import com.ldgroup.easycodedemo.entity.Job;

import java.util.List;

/**
 * 岗位(Job)表服务接口
 *
 * @author makejava
 * @since 2020-06-28 14:35:58
 */
public interface JobService {

    List<Job> selectAllJobs();

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Job queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Job> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param job 实例对象
     * @return 实例对象
     */
    Job insert(Job job);

    /**
     * 修改数据
     *
     * @param job 实例对象
     * @return 实例对象
     */
    Job update(Job job);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    List<Job> selectJobsByCondition(String id);
}