package cn.hellomyheart.logistics.management.system.service;

import cn.hellomyheart.logistics.management.system.entity.Cargoerror;
public interface CargoerrorService{


    int deleteByPrimaryKey(Integer id);

    int insert(Cargoerror record);

    int insertSelective(Cargoerror record);

    Cargoerror selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cargoerror record);

    int updateByPrimaryKey(Cargoerror record);

}
