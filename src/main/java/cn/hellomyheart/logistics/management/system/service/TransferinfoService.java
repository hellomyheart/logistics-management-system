package cn.hellomyheart.logistics.management.system.service;

import cn.hellomyheart.logistics.management.system.entity.Transferinfo;
public interface TransferinfoService{


    int deleteByPrimaryKey(Integer id);

    int insert(Transferinfo record);

    int insertSelective(Transferinfo record);

    Transferinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Transferinfo record);

    int updateByPrimaryKey(Transferinfo record);

}