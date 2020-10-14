package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.Customerinfo;
public interface CustomerinfoService{


    int deleteByPrimaryKey(String customerCode);

    int insert(Customerinfo record);

    int insertSelective(Customerinfo record);

    Customerinfo selectByPrimaryKey(String customerCode);

    int updateByPrimaryKeySelective(Customerinfo record);

    int updateByPrimaryKey(Customerinfo record);

}
