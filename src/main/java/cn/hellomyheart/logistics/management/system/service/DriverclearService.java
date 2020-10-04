package cn.hellomyheart.logistics.management.system.service;

import cn.hellomyheart.logistics.management.system.entity.Driverclear;
public interface DriverclearService{


    int deleteByPrimaryKey(String backBillCode);

    int insert(Driverclear record);

    int insertSelective(Driverclear record);

    Driverclear selectByPrimaryKey(String backBillCode);

    int updateByPrimaryKeySelective(Driverclear record);

    int updateByPrimaryKey(Driverclear record);

}
