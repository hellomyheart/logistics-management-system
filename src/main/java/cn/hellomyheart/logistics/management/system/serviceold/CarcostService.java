package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entity.Carcost;
public interface CarcostService{


    int deleteByPrimaryKey(String driverCode);

    int insert(Carcost record);

    int insertSelective(Carcost record);

    Carcost selectByPrimaryKey(String driverCode);

    int updateByPrimaryKeySelective(Carcost record);

    int updateByPrimaryKey(Carcost record);

}
