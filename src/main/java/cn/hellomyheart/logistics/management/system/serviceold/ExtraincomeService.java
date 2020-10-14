package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.Extraincome;
public interface ExtraincomeService{


    int deleteByPrimaryKey(Integer id);

    int insert(Extraincome record);

    int insertSelective(Extraincome record);

    Extraincome selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Extraincome record);

    int updateByPrimaryKey(Extraincome record);

}
