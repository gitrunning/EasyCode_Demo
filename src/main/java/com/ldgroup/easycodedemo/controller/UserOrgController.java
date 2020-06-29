package com.ldgroup.easycodedemo.controller;

import com.ldgroup.easycodedemo.entity.UserOrg;
import com.ldgroup.easycodedemo.service.UserOrgService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UserOrg)表控制层
 *
 * @author makejava
 * @since 2020-06-28 14:36:00
 */
@RestController
@RequestMapping("userOrg")
public class UserOrgController {
    /**
     * 服务对象
     */
    @Resource
    private UserOrgService userOrgService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserOrg selectOne(String id) {
        return this.userOrgService.queryById(id);
    }

}