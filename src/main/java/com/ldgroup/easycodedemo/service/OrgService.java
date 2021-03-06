package com.ldgroup.easycodedemo.service;

import com.ldgroup.easycodedemo.entity.Org;
import java.util.List;

/**
 * 组织(Org)表服务接口
 *
 * @author makejava
 * @since 2020-06-28 14:35:58
 */
public interface OrgService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Org queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Org> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param org 实例对象
     * @return 实例对象
     */
    Org insert(Org org);

    /**
     * 修改数据
     *
     * @param org 实例对象
     * @return 实例对象
     */
    Org update(Org org);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}