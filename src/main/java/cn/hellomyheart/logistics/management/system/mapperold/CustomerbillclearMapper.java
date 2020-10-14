package cn.hellomyheart.logistics.management.system.mapperold;

import cn.hellomyheart.logistics.management.system.entityold.Customerbillclear;

public interface CustomerbillclearMapper {
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
    int insert(Customerbillclear record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Customerbillclear record);

    /**
     * select by primary key
     * @param goodsBillCode primary key
     * @return object by primary key
     */
    Customerbillclear selectByPrimaryKey(String goodsBillCode);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Customerbillclear record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Customerbillclear record);
}
