package cn.hellomyheart.logistics.management.system.service;

import cn.hellomyheart.logistics.management.system.entity.Customerinfo;
public interface CustomerinfoService{


    int deleteByPrimaryKey(String customerCode);

    int insert(Customerinfo record);

    int insertSelective(Customerinfo record);

    Customerinfo selectByPrimaryKey(String customerCode);

    int updateByPrimaryKeySelective(Customerinfo record);

    int updateByPrimaryKey(Customerinfo record);

}
