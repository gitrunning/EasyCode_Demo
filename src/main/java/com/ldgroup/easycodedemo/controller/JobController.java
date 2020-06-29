package com.ldgroup.easycodedemo.controller;

import com.ldgroup.easycodedemo.entity.Job;
import com.ldgroup.easycodedemo.service.JobService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 岗位(Job)表控制层
 *
 * @author makejava
 * @since 2020-06-28 14:35:58
 */
@RestController
@RequestMapping("job")
public class JobController {
    /**
     * 服务对象
     */
    @Resource
    private JobService jobService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Job selectOne(String id) {
        return this.jobService.queryById(id);
    }

    @GetMapping("selectOne/id/{id}")
    public List<Job> selectJobsByCondition(@PathVariable("id") String id) {
        return this.jobService.selectJobsByCondition(id);
    }


}