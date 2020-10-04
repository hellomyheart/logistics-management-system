package cn.hellomyheart.logistics.management.system.service;

import cn.hellomyheart.logistics.management.system.entity.Customeramount;
public interface CustomeramountService{


    int deleteByPrimaryKey(String sendGoodsCustomer);

    int insert(Customeramount record);

    int insertSelective(Customeramount record);

    Customeramount selectByPrimaryKey(String sendGoodsCustomer);

    int updateByPrimaryKeySelective(Customeramount record);

    int updateByPrimaryKey(Customeramount record);

}
