package cn.hellomyheart.logistics.management.system.service;

import cn.hellomyheart.logistics.management.system.entity.Incomemonthlytemp;
public interface IncomemonthlytempService{


    int deleteByPrimaryKey(Integer id);

    int insert(Incomemonthlytemp record);

    int insertSelective(Incomemonthlytemp record);

    Incomemonthlytemp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Incomemonthlytemp record);

    int updateByPrimaryKey(Incomemonthlytemp record);

}