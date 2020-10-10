package cn.hellomyheart.logistics.management.system.service;

import cn.hellomyheart.logistics.management.system.entity.Cargoreceiptdetail;

import java.util.List;

public interface CargoreceiptdetailService{


    int deleteByPrimaryKey(String goodsRevertBillId);

    int insert(Cargoreceiptdetail record);

    int insertSelective(Cargoreceiptdetail record);

    Cargoreceiptdetail selectByPrimaryKey(String goodsRevertBillId);

    List<Cargoreceiptdetail> selectAll();

    int updateByPrimaryKeySelective(Cargoreceiptdetail record);

    int updateByPrimaryKey(Cargoreceiptdetail record);

    List<Cargoreceiptdetail> selectPreCode();
}
