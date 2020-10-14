package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.Goodsbill;
public interface GoodsbillService{


    int deleteByPrimaryKey(String goodsBillCode);

    int insert(Goodsbill record);

    int insertSelective(Goodsbill record);

    Goodsbill selectByPrimaryKey(String goodsBillCode);

    int updateByPrimaryKeySelective(Goodsbill record);

    int updateByPrimaryKey(Goodsbill record);

}
