package cn.hellomyheart.logistics.management.system.mapperold;

import cn.hellomyheart.logistics.management.system.entity.Carcost;

public interface CarcostMapper {
    /**
     * delete by primary key
     * @param driverCode primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String driverCode);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Carcost record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Carcost record);

    /**
     * select by primary key
     * @param driverCode primary key
     * @return object by primary key
     */
    Carcost selectByPrimaryKey(String driverCode);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Carcost record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Carcost record);
}
