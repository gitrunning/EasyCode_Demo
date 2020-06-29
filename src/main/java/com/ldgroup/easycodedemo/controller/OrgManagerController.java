package com.ldgroup.easycodedemo.controller;

import com.ldgroup.easycodedemo.entity.OrgManager;
import com.ldgroup.easycodedemo.service.OrgManagerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 组织主管关联(OrgManager)表控制层
 *
 * @author makejava
 * @since 2020-06-28 14:35:58
 */
@RestController
@RequestMapping("orgManager")
public class OrgManagerController {
    /**
     * 服务对象
     */
    @Resource
    private OrgManagerService orgManagerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public OrgManager selectOne(String id) {
        return this.orgManagerService.queryById(id);
    }

}