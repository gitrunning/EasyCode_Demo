package com.ldgroup.easycodedemo.service.impl;

import com.ldgroup.easycodedemo.entity.OrgPosition;
import com.ldgroup.easycodedemo.dao.mapper.OrgPositionDao;
import com.ldgroup.easycodedemo.service.OrgPositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 组织岗位关联(OrgPosition)表服务实现类
 *
 * @author makejava
 * @since 2020-06-28 14:35:58
 */
@Service("orgPositionService")
public class OrgPositionServiceImpl implements OrgPositionService {
    @Resource
    private OrgPositionDao orgPositionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OrgPosition queryById(String id) {
        return this.orgPositionDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OrgPosition> queryAllByLimit(int offset, int limit) {
        return this.orgPositionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orgPosition 实例对象
     * @return 实例对象
     */
    @Override
    public OrgPosition insert(OrgPosition orgPosition) {
        this.orgPositionDao.insert(orgPosition);
        return orgPosition;
    }

    /**
     * 修改数据
     *
     * @param orgPosition 实例对象
     * @return 实例对象
     */
    @Override
    public OrgPosition update(OrgPosition orgPosition) {
        this.orgPositionDao.update(orgPosition);
        return this.queryById(orgPosition.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.orgPositionDao.deleteById(id) > 0;
    }
}