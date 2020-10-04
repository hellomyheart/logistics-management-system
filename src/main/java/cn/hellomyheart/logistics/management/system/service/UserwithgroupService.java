package cn.hellomyheart.logistics.management.system.service;

import cn.hellomyheart.logistics.management.system.entity.Userwithgroup;
public interface UserwithgroupService{


    int deleteByPrimaryKey(Integer id);

    int insert(Userwithgroup record);

    int insertSelective(Userwithgroup record);

    Userwithgroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userwithgroup record);

    int updateByPrimaryKey(Userwithgroup record);

}
