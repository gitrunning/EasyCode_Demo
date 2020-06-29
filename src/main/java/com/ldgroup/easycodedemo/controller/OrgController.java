package com.ldgroup.easycodedemo.controller;

import com.ldgroup.easycodedemo.entity.Org;
import com.ldgroup.easycodedemo.service.OrgService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 组织(Org)表控制层
 *
 * @author makejava
 * @since 2020-06-28 14:35:58
 */
@RestController
@RequestMapping("org")
public class OrgController {
    /**
     * 服务对象
     */
    @Resource
    private OrgService orgService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Org selectOne(String id) {
        return this.orgService.queryById(id);
    }

}