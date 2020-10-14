package cn.hellomyheart.logistics.management.system.serviceold.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.ContactsserviceMapper;
import cn.hellomyheart.logistics.management.system.entityold.Contactsservice;
import cn.hellomyheart.logistics.management.system.serviceold.ContactsserviceService;
//@Service
public class ContactsserviceServiceImpl implements ContactsserviceService{

    @Resource
    private ContactsserviceMapper contactsserviceMapper;

    @Override
    public int deleteByPrimaryKey(String sendGoodsCustomer) {
        return contactsserviceMapper.deleteByPrimaryKey(sendGoodsCustomer);
    }

    @Override
    public int insert(Contactsservice record) {
        return contactsserviceMapper.insert(record);
    }

    @Override
    public int insertSelective(Contactsservice record) {
        return contactsserviceMapper.insertSelective(record);
    }

    @Override
    public Contactsservice selectByPrimaryKey(String sendGoodsCustomer) {
        return contactsserviceMapper.selectByPrimaryKey(sendGoodsCustomer);
    }

    @Override
    public int updateByPrimaryKeySelective(Contactsservice record) {
        return contactsserviceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Contactsservice record) {
        return contactsserviceMapper.updateByPrimaryKey(record);
    }

}
