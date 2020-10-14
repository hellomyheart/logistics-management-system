package cn.hellomyheart.logistics.management.system.mapperold;

import cn.hellomyheart.logistics.management.system.entityold.Goodsbillevent;

public interface GoodsbilleventMapper {
    /**
     * delete by primary key
     * @param goodsBillId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String goodsBillId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Goodsbillevent record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Goodsbillevent record);

    /**
     * select by primary key
     * @param goodsBillId primary key
     * @return object by primary key
     */
    Goodsbillevent selectByPrimaryKey(String goodsBillId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Goodsbillevent record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Goodsbillevent record);
}
