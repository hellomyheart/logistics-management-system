package cn.hellomyheart.logistics.management.system.service;

import cn.hellomyheart.logistics.management.system.entity.Billinfo;
public interface BillinfoService{


    int deleteByPrimaryKey(Integer id);

    int insert(Billinfo record);

    int insertSelective(Billinfo record);

    Billinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Billinfo record);

    int updateByPrimaryKey(Billinfo record);

}
