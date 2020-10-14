package cn.hellomyheart.logistics.management.system.mapperold;

import cn.hellomyheart.logistics.management.system.entity.Goodsbill;

public interface GoodsbillMapper {
    /**
     * delete by primary key
     * @param goodsBillCode primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String goodsBillCode);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Goodsbill record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Goodsbill record);

    /**
     * select by primary key
     * @param goodsBillCode primary key
     * @return object by primary key
     */
    Goodsbill selectByPrimaryKey(String goodsBillCode);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Goodsbill record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Goodsbill record);
}
