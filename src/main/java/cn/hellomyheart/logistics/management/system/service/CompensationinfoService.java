package cn.hellomyheart.logistics.management.system.service;

import cn.hellomyheart.logistics.management.system.entity.Compensationinfo;
public interface CompensationinfoService{


    int deleteByPrimaryKey(Integer id);

    int insert(Compensationinfo record);

    int insertSelective(Compensationinfo record);

    Compensationinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Compensationinfo record);

    int updateByPrimaryKey(Compensationinfo record);

}
