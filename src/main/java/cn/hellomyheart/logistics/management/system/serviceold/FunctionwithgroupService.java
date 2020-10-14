package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.Functionwithgroup;
public interface FunctionwithgroupService{


    int deleteByPrimaryKey(Integer id);

    int insert(Functionwithgroup record);

    int insertSelective(Functionwithgroup record);

    Functionwithgroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Functionwithgroup record);

    int updateByPrimaryKey(Functionwithgroup record);

}
