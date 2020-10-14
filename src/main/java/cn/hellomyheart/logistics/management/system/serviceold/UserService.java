package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.User;
public interface UserService{


    int deleteByPrimaryKey(String loginId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String loginId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
