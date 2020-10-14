package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.Userwithgroup;
public interface UserwithgroupService{


    int deleteByPrimaryKey(Integer id);

    int insert(Userwithgroup record);

    int insertSelective(Userwithgroup record);

    Userwithgroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userwithgroup record);

    int updateByPrimaryKey(Userwithgroup record);

}
