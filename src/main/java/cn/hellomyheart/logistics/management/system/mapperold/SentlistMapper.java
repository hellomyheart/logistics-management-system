package cn.hellomyheart.logistics.management.system.mapperold;

import cn.hellomyheart.logistics.management.system.entityold.Sentlist;

public interface SentlistMapper {
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
    int insert(Sentlist record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Sentlist record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Sentlist selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Sentlist record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Sentlist record);
}
