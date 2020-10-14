package cn.hellomyheart.logistics.management.system.mapperold;

import cn.hellomyheart.logistics.management.system.entityold.Extraincome;

public interface ExtraincomeMapper {
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
    int insert(Extraincome record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Extraincome record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Extraincome selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Extraincome record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Extraincome record);
}
