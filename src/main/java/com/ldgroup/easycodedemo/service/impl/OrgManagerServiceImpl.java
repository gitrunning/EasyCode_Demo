package com.ldgroup.easycodedemo.service.impl;

import com.ldgroup.easycodedemo.entity.OrgManager;
import com.ldgroup.easycodedemo.dao.mapper.OrgManagerDao;
import com.ldgroup.easycodedemo.service.OrgManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 组织主管关联(OrgManager)表服务实现类
 *
 * @author makejava
 * @since 2020-06-28 14:35:58
 */
@Service("orgManagerService")
public class OrgManagerServiceImpl implements OrgManagerService {
    @Resource
    private OrgManagerDao orgManagerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OrgManager queryById(String id) {
        return this.orgManagerDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OrgManager> queryAllByLimit(int offset, int limit) {
        return this.orgManagerDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orgManager 实例对象
     * @return 实例对象
     */
    @Override
    public OrgManager insert(OrgManager orgManager) {
        this.orgManagerDao.insert(orgManager);
        return orgManager;
    }

    /**
     * 修改数据
     *
     * @param orgManager 实例对象
     * @return 实例对象
     */
    @Override
    public OrgManager update(OrgManager orgManager) {
        this.orgManagerDao.update(orgManager);
        return this.queryById(orgManager.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.orgManagerDao.deleteById(id) > 0;
    }
}