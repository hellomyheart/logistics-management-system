package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entity.Usergroup;
public interface UsergroupService{


    int deleteByPrimaryKey(Integer id);

    int insert(Usergroup record);

    int insertSelective(Usergroup record);

    Usergroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Usergroup record);

    int updateByPrimaryKey(Usergroup record);

}
