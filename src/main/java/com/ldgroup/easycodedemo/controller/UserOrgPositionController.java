package com.ldgroup.easycodedemo.controller;

import com.ldgroup.easycodedemo.entity.UserOrgPosition;
import com.ldgroup.easycodedemo.service.UserOrgPositionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户职位关联(UserOrgPosition)表控制层
 *
 * @author makejava
 * @since 2020-06-28 14:36:00
 */
@RestController
@RequestMapping("userOrgPosition")
public class UserOrgPositionController {
    /**
     * 服务对象
     */
    @Resource
    private UserOrgPositionService userOrgPositionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserOrgPosition selectOne(String id) {
        return this.userOrgPositionService.queryById(id);
    }

}