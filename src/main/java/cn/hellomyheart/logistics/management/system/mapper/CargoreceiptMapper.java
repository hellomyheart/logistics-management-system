package cn.hellomyheart.logistics.management.system.mapper;

import cn.hellomyheart.logistics.management.system.entity.Cargoreceipt;

import java.util.List;

public interface CargoreceiptMapper {
    /**
     * delete by primary key
     * @param goodsRevertBillCode primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String goodsRevertBillCode);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Cargoreceipt record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Cargoreceipt record);

    /**
     * select by primary key
     * @param goodsRevertBillCode primary key
     * @return object by primary key
     */
    Cargoreceipt selectByPrimaryKey(String goodsRevertBillCode);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Cargoreceipt record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Cargoreceipt record);

    List<Cargoreceipt> selectAll();
}
