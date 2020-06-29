package com.ldgroup.easycodedemo.service.impl;

import com.ldgroup.easycodedemo.entity.UserOrg;
import com.ldgroup.easycodedemo.dao.mapper.UserOrgDao;
import com.ldgroup.easycodedemo.service.UserOrgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UserOrg)表服务实现类
 *
 * @author makejava
 * @since 2020-06-28 14:36:00
 */
@Service("userOrgService")
public class UserOrgServiceImpl implements UserOrgService {
    @Resource
    private UserOrgDao userOrgDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserOrg queryById(String id) {
        return this.userOrgDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UserOrg> queryAllByLimit(int offset, int limit) {
        return this.userOrgDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userOrg 实例对象
     * @return 实例对象
     */
    @Override
    public UserOrg insert(UserOrg userOrg) {
        this.userOrgDao.insert(userOrg);
        return userOrg;
    }

    /**
     * 修改数据
     *
     * @param userOrg 实例对象
     * @return 实例对象
     */
    @Override
    public UserOrg update(UserOrg userOrg) {
        this.userOrgDao.update(userOrg);
        return this.queryById(userOrg.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.userOrgDao.deleteById(id) > 0;
    }
}