package cn.hellomyheart.logistics.management.system.mapperold;

import cn.hellomyheart.logistics.management.system.entityold.Customerinfo;

public interface CustomerinfoMapper {
    /**
     * delete by primary key
     * @param customerCode primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String customerCode);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Customerinfo record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Customerinfo record);

    /**
     * select by primary key
     * @param customerCode primary key
     * @return object by primary key
     */
    Customerinfo selectByPrimaryKey(String customerCode);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Customerinfo record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Customerinfo record);
}
