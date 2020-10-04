package cn.hellomyheart.logistics.management.system.service;

import cn.hellomyheart.logistics.management.system.entity.Transfercominfo;
public interface TransfercominfoService{


    int deleteByPrimaryKey(Integer id);

    int insert(Transfercominfo record);

    int insertSelective(Transfercominfo record);

    Transfercominfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Transfercominfo record);

    int updateByPrimaryKey(Transfercominfo record);

}
