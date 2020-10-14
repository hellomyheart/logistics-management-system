package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.Driverinfo;
public interface DriverinfoService{


    int deleteByPrimaryKey(String id);

    int insert(Driverinfo record);

    int insertSelective(Driverinfo record);

    Driverinfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Driverinfo record);

    int updateByPrimaryKey(Driverinfo record);

}
