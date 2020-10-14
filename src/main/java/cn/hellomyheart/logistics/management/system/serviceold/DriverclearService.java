package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.Driverclear;
public interface DriverclearService{


    int deleteByPrimaryKey(String backBillCode);

    int insert(Driverclear record);

    int insertSelective(Driverclear record);

    Driverclear selectByPrimaryKey(String backBillCode);

    int updateByPrimaryKeySelective(Driverclear record);

    int updateByPrimaryKey(Driverclear record);

}
