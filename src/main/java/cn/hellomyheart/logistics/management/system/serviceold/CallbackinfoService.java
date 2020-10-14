package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.Callbackinfo;
public interface CallbackinfoService{


    int deleteByPrimaryKey(Integer id);

    int insert(Callbackinfo record);

    int insertSelective(Callbackinfo record);

    Callbackinfo selectByPrimaryKey(Integer id);

    Callbackinfo selectByDetails(String goodsBillId, String type);

    int updateByPrimaryKeySelective(Callbackinfo record);

    int updateByPrimaryKey(Callbackinfo record);

}
