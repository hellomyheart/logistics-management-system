package cn.hellomyheart.logistics.management.system.mapper;

import cn.hellomyheart.logistics.management.system.entity.User;

public interface UserMapper {
    /**
     * delete by primary key
     * @param loginId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String loginId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(User record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(User record);

    /**
     * select by primary key
     * @param loginId primary key
     * @return object by primary key
     */
    User selectByPrimaryKey(String loginId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(User record);
}