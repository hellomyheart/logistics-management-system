package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.TPermission;
public interface TPermissionService{


    int deleteByPrimaryKey(String id);

    int insert(TPermission record);

    int insertSelective(TPermission record);

    TPermission selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TPermission record);

    int updateByPrimaryKey(TPermission record);

}
