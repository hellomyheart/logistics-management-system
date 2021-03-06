package cn.hellomyheart.logistics.management.system.serviceold.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.entityold.TPermission;
import cn.hellomyheart.logistics.management.system.mapperold.TPermissionMapper;
import cn.hellomyheart.logistics.management.system.serviceold.TPermissionService;
//@Service
public class TPermissionServiceImpl implements TPermissionService{

    @Resource
    private TPermissionMapper tPermissionMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return tPermissionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TPermission record) {
        return tPermissionMapper.insert(record);
    }

    @Override
    public int insertSelective(TPermission record) {
        return tPermissionMapper.insertSelective(record);
    }

    @Override
    public TPermission selectByPrimaryKey(String id) {
        return tPermissionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TPermission record) {
        return tPermissionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TPermission record) {
        return tPermissionMapper.updateByPrimaryKey(record);
    }

}
