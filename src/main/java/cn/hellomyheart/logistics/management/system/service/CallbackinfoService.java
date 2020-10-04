package cn.hellomyheart.logistics.management.system.service;

import cn.hellomyheart.logistics.management.system.entity.Callbackinfo;
public interface CallbackinfoService{


    int deleteByPrimaryKey(Integer id);

    int insert(Callbackinfo record);

    int insertSelective(Callbackinfo record);

    Callbackinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Callbackinfo record);

    int updateByPrimaryKey(Callbackinfo record);

}
