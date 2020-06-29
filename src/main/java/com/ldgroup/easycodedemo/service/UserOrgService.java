package com.ldgroup.easycodedemo.service;

import com.ldgroup.easycodedemo.entity.UserOrg;
import java.util.List;

/**
 * (UserOrg)表服务接口
 *
 * @author makejava
 * @since 2020-06-28 14:36:00
 */
public interface UserOrgService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserOrg queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserOrg> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param userOrg 实例对象
     * @return 实例对象
     */
    UserOrg insert(UserOrg userOrg);

    /**
     * 修改数据
     *
     * @param userOrg 实例对象
     * @return 实例对象
     */
    UserOrg update(UserOrg userOrg);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}