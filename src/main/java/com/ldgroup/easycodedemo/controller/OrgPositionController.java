package com.ldgroup.easycodedemo.controller;

import com.ldgroup.easycodedemo.entity.OrgPosition;
import com.ldgroup.easycodedemo.service.OrgPositionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 组织岗位关联(OrgPosition)表控制层
 *
 * @author makejava
 * @since 2020-06-28 14:35:58
 */
@RestController
@RequestMapping("orgPosition")
public class OrgPositionController {
    /**
     * 服务对象
     */
    @Resource
    private OrgPositionService orgPositionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public OrgPosition selectOne(String id) {
        return this.orgPositionService.queryById(id);
    }

}