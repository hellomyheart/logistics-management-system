package cn.hellomyheart.logistics.management.system.service;

import cn.hellomyheart.logistics.management.system.entity.Customerreceiptinfo;
public interface CustomerreceiptinfoService{


    int deleteByPrimaryKey(Integer id);

    int insert(Customerreceiptinfo record);

    int insertSelective(Customerreceiptinfo record);

    Customerreceiptinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customerreceiptinfo record);

    int updateByPrimaryKey(Customerreceiptinfo record);

}
