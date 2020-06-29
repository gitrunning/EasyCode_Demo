package com.ldgroup.easycodedemo.service;

import com.ldgroup.easycodedemo.entity.UserOrgPosition;
import java.util.List;

/**
 * 用户职位关联(UserOrgPosition)表服务接口
 *
 * @author makejava
 * @since 2020-06-28 14:36:00
 */
public interface UserOrgPositionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserOrgPosition queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserOrgPosition> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param userOrgPosition 实例对象
     * @return 实例对象
     */
    UserOrgPosition insert(UserOrgPosition userOrgPosition);

    /**
     * 修改数据
     *
     * @param userOrgPosition 实例对象
     * @return 实例对象
     */
    UserOrgPosition update(UserOrgPosition userOrgPosition);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}