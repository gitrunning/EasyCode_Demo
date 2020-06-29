package com.ldgroup.easycodedemo.controller;

import com.ldgroup.easycodedemo.entity.OrgJob;
import com.ldgroup.easycodedemo.service.OrgJobService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 组织岗位关联(OrgJob)表控制层
 *
 * @author makejava
 * @since 2020-06-28 14:35:58
 */
@RestController
@RequestMapping("orgJob")
public class OrgJobController {
    /**
     * 服务对象
     */
    @Resource
    private OrgJobService orgJobService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public OrgJob selectOne(String id) {
        return this.orgJobService.queryById(id);
    }

}