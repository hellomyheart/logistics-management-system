package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.TRolePermission;
public interface TRolePermissionService{


    int deleteByPrimaryKey(String roleId,String permissionId);

    int insert(TRolePermission record);

    int insertSelective(TRolePermission record);

}
