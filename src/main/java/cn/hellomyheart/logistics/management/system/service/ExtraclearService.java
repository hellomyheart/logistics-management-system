package cn.hellomyheart.logistics.management.system.service;

import cn.hellomyheart.logistics.management.system.entity.Extraclear;
public interface ExtraclearService{


    int deleteByPrimaryKey(Integer id);

    int insert(Extraclear record);

    int insertSelective(Extraclear record);

    Extraclear selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Extraclear record);

    int updateByPrimaryKey(Extraclear record);

}