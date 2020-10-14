package cn.hellomyheart.logistics.management.system.serviceold.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.entityold.Customerreceiptinfo;
import cn.hellomyheart.logistics.management.system.mapperold.CustomerreceiptinfoMapper;
import cn.hellomyheart.logistics.management.system.serviceold.CustomerreceiptinfoService;
//@Service
public class CustomerreceiptinfoServiceImpl implements CustomerreceiptinfoService{

    @Resource
    private CustomerreceiptinfoMapper customerreceiptinfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return customerreceiptinfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Customerreceiptinfo record) {
        return customerreceiptinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Customerreceiptinfo record) {
        return customerreceiptinfoMapper.insertSelective(record);
    }

    @Override
    public Customerreceiptinfo selectByPrimaryKey(Integer id) {
        return customerreceiptinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Customerreceiptinfo record) {
        return customerreceiptinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Customerreceiptinfo record) {
        return customerreceiptinfoMapper.updateByPrimaryKey(record);
    }

}
