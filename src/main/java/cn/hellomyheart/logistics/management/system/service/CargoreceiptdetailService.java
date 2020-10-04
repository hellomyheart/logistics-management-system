package cn.hellomyheart.logistics.management.system.service;

import cn.hellomyheart.logistics.management.system.entity.Cargoreceiptdetail;
public interface CargoreceiptdetailService{


    int deleteByPrimaryKey(String goodsRevertBillId);

    int insert(Cargoreceiptdetail record);

    int insertSelective(Cargoreceiptdetail record);

    Cargoreceiptdetail selectByPrimaryKey(String goodsRevertBillId);

    int updateByPrimaryKeySelective(Cargoreceiptdetail record);

    int updateByPrimaryKey(Cargoreceiptdetail record);

}
