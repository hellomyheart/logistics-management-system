package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.Customerbillclear;
public interface CustomerbillclearService{


    int deleteByPrimaryKey(String goodsBillCode);

    int insert(Customerbillclear record);

    int insertSelective(Customerbillclear record);

    Customerbillclear selectByPrimaryKey(String goodsBillCode);

    int updateByPrimaryKeySelective(Customerbillclear record);

    int updateByPrimaryKey(Customerbillclear record);

}
