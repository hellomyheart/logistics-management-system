package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.Cargoreceipt;

public interface CargoreceiptService{


    int deleteByPrimaryKey(String goodsRevertBillCode);

    int insert(Cargoreceipt record);

    int insertSelective(Cargoreceipt record);

    Cargoreceipt selectByPrimaryKey(String goodsRevertBillCode);

    int updateByPrimaryKeySelective(Cargoreceipt record);

    int updateByPrimaryKey(Cargoreceipt record);

}
