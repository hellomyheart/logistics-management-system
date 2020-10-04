package cn.hellomyheart.logistics.management.system.mapper;

import cn.hellomyheart.logistics.management.system.entity.Userwithgroup;

public interface UserwithgroupMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Userwithgroup record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Userwithgroup record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Userwithgroup selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Userwithgroup record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Userwithgroup record);
}