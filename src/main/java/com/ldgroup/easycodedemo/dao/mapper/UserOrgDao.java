package com.ldgroup.easycodedemo.dao.mapper;

import com.ldgroup.easycodedemo.dao.MyBaseDao;
import com.ldgroup.easycodedemo.entity.UserOrg;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (UserOrg)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-28 14:36:00
 */
@Repository
public interface UserOrgDao extends MyBaseDao<UserOrg> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserOrg queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserOrg> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param userOrg 实例对象
     * @return 对象列表
     */
    List<UserOrg> queryAll(UserOrg userOrg);

    /**
     * 新增数据
     *
     * @param userOrg 实例对象
     * @return 影响行数
     */
    int insert(UserOrg userOrg);

    /**
     * 修改数据
     *
     * @param userOrg 实例对象
     * @return 影响行数
     */
    int update(UserOrg userOrg);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}