package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.Routeinfo;
public interface RouteinfoService{


    int deleteByPrimaryKey(Integer id);

    int insert(Routeinfo record);

    int insertSelective(Routeinfo record);

    Routeinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Routeinfo record);

    int updateByPrimaryKey(Routeinfo record);

}
