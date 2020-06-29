package com.ldgroup.easycodedemo.service.impl;

import com.ldgroup.easycodedemo.entity.OrgJob;
import com.ldgroup.easycodedemo.dao.mapper.OrgJobDao;
import com.ldgroup.easycodedemo.service.OrgJobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 组织岗位关联(OrgJob)表服务实现类
 *
 * @author makejava
 * @since 2020-06-28 14:35:58
 */
@Service("orgJobService")
public class OrgJobServiceImpl implements OrgJobService {
    @Resource
    private OrgJobDao orgJobDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OrgJob queryById(String id) {
        return this.orgJobDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OrgJob> queryAllByLimit(int offset, int limit) {
        return this.orgJobDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orgJob 实例对象
     * @return 实例对象
     */
    @Override
    public OrgJob insert(OrgJob orgJob) {
        this.orgJobDao.insert(orgJob);
        return orgJob;
    }

    /**
     * 修改数据
     *
     * @param orgJob 实例对象
     * @return 实例对象
     */
    @Override
    public OrgJob update(OrgJob orgJob) {
        this.orgJobDao.update(orgJob);
        return this.queryById(orgJob.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.orgJobDao.deleteById(id) > 0;
    }
}