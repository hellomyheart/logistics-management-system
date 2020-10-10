package cn.hellomyheart.logistics.management.system.service;

import cn.hellomyheart.logistics.management.system.entity.TRolePermission;
public interface TRolePermissionService{


    int deleteByPrimaryKey(String roleId,String permissionId);

    int insert(TRolePermission record);

    int insertSelective(TRolePermission record);

}
