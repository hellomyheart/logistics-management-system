package cn.hellomyheart.logistics.management.system.mapperold;

import cn.hellomyheart.logistics.management.system.entity.Customeramount;

public interface CustomeramountMapper {
    /**
     * delete by primary key
     * @param sendGoodsCustomer primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String sendGoodsCustomer);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Customeramount record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Customeramount record);

    /**
     * select by primary key
     * @param sendGoodsCustomer primary key
     * @return object by primary key
     */
    Customeramount selectByPrimaryKey(String sendGoodsCustomer);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Customeramount record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Customeramount record);
}
