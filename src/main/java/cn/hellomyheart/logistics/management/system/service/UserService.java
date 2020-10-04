package cn.hellomyheart.logistics.management.system.service;

import cn.hellomyheart.logistics.management.system.entity.User;
public interface UserService{


    int deleteByPrimaryKey(String loginId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String loginId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
