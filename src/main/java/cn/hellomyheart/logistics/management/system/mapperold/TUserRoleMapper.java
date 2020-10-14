package cn.hellomyheart.logistics.management.system.mapperold;

import cn.hellomyheart.logistics.management.system.entity.TUserRole;
import org.apache.ibatis.annotations.Param;

public interface TUserRoleMapper {
    /**
     * delete by primary key
     * @param userId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(@Param("userId") String userId, @Param("roleId") String roleId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(TUserRole record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TUserRole record);

    /**
     * select by primary key
     * @param userId primary key
     * @return object by primary key
     */
    TUserRole selectByPrimaryKey(@Param("userId") String userId, @Param("roleId") String roleId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TUserRole record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TUserRole record);
}
