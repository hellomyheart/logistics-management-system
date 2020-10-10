package cn.hellomyheart.logistics.management.system.mapper;

import cn.hellomyheart.logistics.management.system.entity.Cargoreceiptdetail;

public interface CargoreceiptdetailMapper {
    /**
     * delete by primary key
     * @param goodsRevertBillId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String goodsRevertBillId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Cargoreceiptdetail record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Cargoreceiptdetail record);

    /**
     * select by primary key
     * @param goodsRevertBillId primary key
     * @return object by primary key
     */
    Cargoreceiptdetail selectByPrimaryKey(String goodsRevertBillId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Cargoreceiptdetail record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Cargoreceiptdetail record);
}