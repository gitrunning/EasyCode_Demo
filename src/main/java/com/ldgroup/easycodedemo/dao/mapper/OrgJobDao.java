package com.ldgroup.easycodedemo.dao.mapper;

import com.ldgroup.easycodedemo.dao.MyBaseDao;
import com.ldgroup.easycodedemo.entity.OrgJob;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 组织岗位关联(OrgJob)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-28 14:35:58
 */
@Repository
public interface OrgJobDao extends MyBaseDao<OrgJob> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrgJob queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrgJob> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param orgJob 实例对象
     * @return 对象列表
     */
    List<OrgJob> queryAll(OrgJob orgJob);

    /**
     * 新增数据
     *
     * @param orgJob 实例对象
     * @return 影响行数
     */
    int insert(OrgJob orgJob);

    /**
     * 修改数据
     *
     * @param orgJob 实例对象
     * @return 影响行数
     */
    int update(OrgJob orgJob);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}