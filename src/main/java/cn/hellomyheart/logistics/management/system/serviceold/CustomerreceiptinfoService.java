package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.Customerreceiptinfo;
public interface CustomerreceiptinfoService{


    int deleteByPrimaryKey(Integer id);

    int insert(Customerreceiptinfo record);

    int insertSelective(Customerreceiptinfo record);

    Customerreceiptinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customerreceiptinfo record);

    int updateByPrimaryKey(Customerreceiptinfo record);

}
