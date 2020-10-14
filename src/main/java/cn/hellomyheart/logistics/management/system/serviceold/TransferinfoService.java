package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.Transferinfo;
public interface TransferinfoService{


    int deleteByPrimaryKey(Integer id);

    int insert(Transferinfo record);

    int insertSelective(Transferinfo record);

    Transferinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Transferinfo record);

    int updateByPrimaryKey(Transferinfo record);

}
