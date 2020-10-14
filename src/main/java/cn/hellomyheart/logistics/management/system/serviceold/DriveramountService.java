package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.Driveramount;
public interface DriveramountService{


    int deleteByPrimaryKey(String driverCode);

    int insert(Driveramount record);

    int insertSelective(Driveramount record);

    Driveramount selectByPrimaryKey(String driverCode);

    int updateByPrimaryKeySelective(Driveramount record);

    int updateByPrimaryKey(Driveramount record);

}
