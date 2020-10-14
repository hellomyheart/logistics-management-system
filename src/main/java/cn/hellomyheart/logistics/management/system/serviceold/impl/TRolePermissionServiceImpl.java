package cn.hellomyheart.logistics.management.system.serviceold.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.TRolePermissionMapper;
import cn.hellomyheart.logistics.management.system.entityold.TRolePermission;
import cn.hellomyheart.logistics.management.system.serviceold.TRolePermissionService;
//@Service
public class TRolePermissionServiceImpl implements TRolePermissionService{

    @Resource
    private TRolePermissionMapper tRolePermissionMapper;

    @Override
    public int deleteByPrimaryKey(String roleId,String permissionId) {
        return tRolePermissionMapper.deleteByPrimaryKey(roleId,permissionId);
    }

    @Override
    public int insert(TRolePermission record) {
        return tRolePermissionMapper.insert(record);
    }

    @Override
    public int insertSelective(TRolePermission record) {
        return tRolePermissionMapper.insertSelective(record);
    }

}
