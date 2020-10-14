package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.Incomemonthlytemp;
public interface IncomemonthlytempService{


    int deleteByPrimaryKey(Integer id);

    int insert(Incomemonthlytemp record);

    int insertSelective(Incomemonthlytemp record);

    Incomemonthlytemp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Incomemonthlytemp record);

    int updateByPrimaryKey(Incomemonthlytemp record);

}
