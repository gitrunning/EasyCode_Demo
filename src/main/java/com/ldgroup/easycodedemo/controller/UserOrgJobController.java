package com.ldgroup.easycodedemo.controller;

import com.ldgroup.easycodedemo.entity.UserOrgJob;
import com.ldgroup.easycodedemo.service.UserOrgJobService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 组织用户关联(UserOrgJob)表控制层
 *
 * @author makejava
 * @since 2020-06-28 14:36:00
 */
@RestController
@RequestMapping("userOrgJob")
public class UserOrgJobController {
    /**
     * 服务对象
     */
    @Resource
    private UserOrgJobService userOrgJobService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserOrgJob selectOne(String id) {
        return this.userOrgJobService.queryById(id);
    }

}