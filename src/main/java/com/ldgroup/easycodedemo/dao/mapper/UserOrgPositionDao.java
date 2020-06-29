package com.ldgroup.easycodedemo.dao.mapper;

import com.ldgroup.easycodedemo.dao.MyBaseDao;
import com.ldgroup.easycodedemo.entity.UserOrgPosition;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户职位关联(UserOrgPosition)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-28 14:36:00
 */
@Repository
public interface UserOrgPositionDao extends MyBaseDao<UserOrgPosition> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserOrgPosition queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserOrgPosition> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param userOrgPosition 实例对象
     * @return 对象列表
     */
    List<UserOrgPosition> queryAll(UserOrgPosition userOrgPosition);

    /**
     * 新增数据
     *
     * @param userOrgPosition 实例对象
     * @return 影响行数
     */
    int insert(UserOrgPosition userOrgPosition);

    /**
     * 修改数据
     *
     * @param userOrgPosition 实例对象
     * @return 影响行数
     */
    int update(UserOrgPosition userOrgPosition);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}