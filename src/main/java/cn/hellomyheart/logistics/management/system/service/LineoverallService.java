package cn.hellomyheart.logistics.management.system.service;

import cn.hellomyheart.logistics.management.system.entity.Lineoverall;
public interface LineoverallService{


    int deleteByPrimaryKey(Integer id);

    int insert(Lineoverall record);

    int insertSelective(Lineoverall record);

    Lineoverall selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Lineoverall record);

    int updateByPrimaryKey(Lineoverall record);

}
