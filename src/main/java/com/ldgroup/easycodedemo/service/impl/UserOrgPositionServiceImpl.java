package com.ldgroup.easycodedemo.service.impl;

import com.ldgroup.easycodedemo.entity.UserOrgPosition;
import com.ldgroup.easycodedemo.dao.mapper.UserOrgPositionDao;
import com.ldgroup.easycodedemo.service.UserOrgPositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户职位关联(UserOrgPosition)表服务实现类
 *
 * @author makejava
 * @since 2020-06-28 14:36:00
 */
@Service("userOrgPositionService")
public class UserOrgPositionServiceImpl implements UserOrgPositionService {
    @Resource
    private UserOrgPositionDao userOrgPositionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserOrgPosition queryById(String id) {
        return this.userOrgPositionDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UserOrgPosition> queryAllByLimit(int offset, int limit) {
        return this.userOrgPositionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userOrgPosition 实例对象
     * @return 实例对象
     */
    @Override
    public UserOrgPosition insert(UserOrgPosition userOrgPosition) {
        this.userOrgPositionDao.insert(userOrgPosition);
        return userOrgPosition;
    }

    /**
     * 修改数据
     *
     * @param userOrgPosition 实例对象
     * @return 实例对象
     */
    @Override
    public UserOrgPosition update(UserOrgPosition userOrgPosition) {
        this.userOrgPositionDao.update(userOrgPosition);
        return this.queryById(userOrgPosition.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.userOrgPositionDao.deleteById(id) > 0;
    }
}