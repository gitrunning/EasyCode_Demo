package com.ldgroup.easycodedemo.service.impl;

import com.ldgroup.easycodedemo.entity.UserOrgJob;
import com.ldgroup.easycodedemo.dao.mapper.UserOrgJobDao;
import com.ldgroup.easycodedemo.service.UserOrgJobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 组织用户关联(UserOrgJob)表服务实现类
 *
 * @author makejava
 * @since 2020-06-28 14:36:00
 */
@Service("userOrgJobService")
public class UserOrgJobServiceImpl implements UserOrgJobService {
    @Resource
    private UserOrgJobDao userOrgJobDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserOrgJob queryById(String id) {
        return this.userOrgJobDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UserOrgJob> queryAllByLimit(int offset, int limit) {
        return this.userOrgJobDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userOrgJob 实例对象
     * @return 实例对象
     */
    @Override
    public UserOrgJob insert(UserOrgJob userOrgJob) {
        this.userOrgJobDao.insert(userOrgJob);
        return userOrgJob;
    }

    /**
     * 修改数据
     *
     * @param userOrgJob 实例对象
     * @return 实例对象
     */
    @Override
    public UserOrgJob update(UserOrgJob userOrgJob) {
        this.userOrgJobDao.update(userOrgJob);
        return this.queryById(userOrgJob.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.userOrgJobDao.deleteById(id) > 0;
    }
}