package cn.hellomyheart.logistics.management.system.service;

import cn.hellomyheart.logistics.management.system.entity.Cargoreceipt;

import java.util.List;

public interface CargoreceiptService{


    int deleteByPrimaryKey(String goodsRevertBillCode);

    int insert(Cargoreceipt record);

    int insertSelective(Cargoreceipt record);

    Cargoreceipt selectByPrimaryKey(String goodsRevertBillCode);

    int updateByPrimaryKeySelective(Cargoreceipt record);

    int updateByPrimaryKey(Cargoreceipt record);

}
