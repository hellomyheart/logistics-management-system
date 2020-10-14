package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entity.Contactsservice;
public interface ContactsserviceService{


    int deleteByPrimaryKey(String sendGoodsCustomer);

    int insert(Contactsservice record);

    int insertSelective(Contactsservice record);

    Contactsservice selectByPrimaryKey(String sendGoodsCustomer);

    int updateByPrimaryKeySelective(Contactsservice record);

    int updateByPrimaryKey(Contactsservice record);

}
