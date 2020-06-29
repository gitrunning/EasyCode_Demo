package com.ldgroup.easycodedemo.service.impl;

import com.ldgroup.easycodedemo.entity.Org;
import com.ldgroup.easycodedemo.dao.mapper.OrgDao;
import com.ldgroup.easycodedemo.service.OrgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 组织(Org)表服务实现类
 *
 * @author makejava
 * @since 2020-06-28 14:35:58
 */
@Service("orgService")
public class OrgServiceImpl implements OrgService {
    @Resource
    private OrgDao orgDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Org queryById(String id) {
        return this.orgDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Org> queryAllByLimit(int offset, int limit) {
        return this.orgDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param org 实例对象
     * @return 实例对象
     */
    @Override
    public Org insert(Org org) {
        this.orgDao.insert(org);
        return org;
    }

    /**
     * 修改数据
     *
     * @param org 实例对象
     * @return 实例对象
     */
    @Override
    public Org update(Org org) {
        this.orgDao.update(org);
        return this.queryById(org.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.orgDao.deleteById(id) > 0;
    }
}