package cn.hellomyheart.logistics.management.system.service;

import cn.hellomyheart.logistics.management.system.entity.Driverinfo;
public interface DriverinfoService{


    int deleteByPrimaryKey(String id);

    int insert(Driverinfo record);

    int insertSelective(Driverinfo record);

    Driverinfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Driverinfo record);

    int updateByPrimaryKey(Driverinfo record);

}
