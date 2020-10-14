package cn.hellomyheart.logistics.management.system.serviceold.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.CustomerinfoMapper;
import cn.hellomyheart.logistics.management.system.entityold.Customerinfo;
import cn.hellomyheart.logistics.management.system.serviceold.CustomerinfoService;
//@Service
public class CustomerinfoServiceImpl implements CustomerinfoService{

    @Resource
    private CustomerinfoMapper customerinfoMapper;

    @Override
    public int deleteByPrimaryKey(String customerCode) {
        return customerinfoMapper.deleteByPrimaryKey(customerCode);
    }

    @Override
    public int insert(Customerinfo record) {
        return customerinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Customerinfo record) {
        return customerinfoMapper.insertSelective(record);
    }

    @Override
    public Customerinfo selectByPrimaryKey(String customerCode) {
        return customerinfoMapper.selectByPrimaryKey(customerCode);
    }

    @Override
    public int updateByPrimaryKeySelective(Customerinfo record) {
        return customerinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Customerinfo record) {
        return customerinfoMapper.updateByPrimaryKey(record);
    }

}
