package cn.hellomyheart.logistics.management.system.mapper;

import cn.hellomyheart.logistics.management.system.entity.Driverclear;

public interface DriverclearMapper {
    /**
     * delete by primary key
     * @param backBillCode primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String backBillCode);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Driverclear record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Driverclear record);

    /**
     * select by primary key
     * @param backBillCode primary key
     * @return object by primary key
     */
    Driverclear selectByPrimaryKey(String backBillCode);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Driverclear record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Driverclear record);
}