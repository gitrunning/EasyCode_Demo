package com.ldgroup.easycodedemo.service;

import com.ldgroup.easycodedemo.entity.OrgManager;
import java.util.List;

/**
 * 组织主管关联(OrgManager)表服务接口
 *
 * @author makejava
 * @since 2020-06-28 14:35:58
 */
public interface OrgManagerService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrgManager queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrgManager> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param orgManager 实例对象
     * @return 实例对象
     */
    OrgManager insert(OrgManager orgManager);

    /**
     * 修改数据
     *
     * @param orgManager 实例对象
     * @return 实例对象
     */
    OrgManager update(OrgManager orgManager);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}