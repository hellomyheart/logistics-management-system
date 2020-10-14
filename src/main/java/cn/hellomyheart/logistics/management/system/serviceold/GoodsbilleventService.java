package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entity.Goodsbillevent;
public interface GoodsbilleventService{


    int deleteByPrimaryKey(String goodsBillId);

    int insert(Goodsbillevent record);

    int insertSelective(Goodsbillevent record);

    Goodsbillevent selectByPrimaryKey(String goodsBillId);

    int updateByPrimaryKeySelective(Goodsbillevent record);

    int updateByPrimaryKey(Goodsbillevent record);

}
