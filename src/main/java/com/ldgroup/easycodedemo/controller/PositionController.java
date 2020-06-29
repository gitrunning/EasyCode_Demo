package com.ldgroup.easycodedemo.controller;

import com.ldgroup.easycodedemo.entity.Position;
import com.ldgroup.easycodedemo.service.PositionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 职位(Position)表控制层
 *
 * @author makejava
 * @since 2020-06-28 14:35:58
 */
@RestController
@RequestMapping("position")
public class PositionController {
    /**
     * 服务对象
     */
    @Resource
    private PositionService positionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Position selectOne(String id) {
        return this.positionService.queryById(id);
    }

}