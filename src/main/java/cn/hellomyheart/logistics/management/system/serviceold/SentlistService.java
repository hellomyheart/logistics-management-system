package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entity.Sentlist;
public interface SentlistService{


    int deleteByPrimaryKey(Integer id);

    int insert(Sentlist record);

    int insertSelective(Sentlist record);

    Sentlist selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sentlist record);

    int updateByPrimaryKey(Sentlist record);

}
