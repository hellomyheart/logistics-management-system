package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.Billrelease;
public interface BillreleaseService{


    int deleteByPrimaryKey(Integer id);

    int insert(Billrelease record);

    int insertSelective(Billrelease record);

    Billrelease selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Billrelease record);

    int updateByPrimaryKey(Billrelease record);

}
