package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entity.Cityexpand;
public interface CityexpandService{


    int deleteByPrimaryKey(Integer id);

    int insert(Cityexpand record);

    int insertSelective(Cityexpand record);

    Cityexpand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cityexpand record);

    int updateByPrimaryKey(Cityexpand record);

}
