package cn.hellomyheart.logistics.management.system.mapperold;

import cn.hellomyheart.logistics.management.system.entityold.TRolePermission;
import org.apache.ibatis.annotations.Param;

public interface TRolePermissionMapper {
    /**
     * delete by primary key
     * @param roleId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(@Param("roleId") String roleId, @Param("permissionId") String permissionId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(TRolePermission record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TRolePermission record);
}
