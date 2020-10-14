package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.Compensationinfo;
public interface CompensationinfoService{


    int deleteByPrimaryKey(Integer id);

    int insert(Compensationinfo record);

    int insertSelective(Compensationinfo record);

    Compensationinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Compensationinfo record);

    int updateByPrimaryKey(Compensationinfo record);

}
