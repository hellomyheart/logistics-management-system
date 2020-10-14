package cn.hellomyheart.logistics.management.system.serviceold.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.CustomeramountMapper;
import cn.hellomyheart.logistics.management.system.entity.Customeramount;
import cn.hellomyheart.logistics.management.system.serviceold.CustomeramountService;
@Service
public class CustomeramountServiceImpl implements CustomeramountService{

    @Resource
    private CustomeramountMapper customeramountMapper;

    @Override
    public int deleteByPrimaryKey(String sendGoodsCustomer) {
        return customeramountMapper.deleteByPrimaryKey(sendGoodsCustomer);
    }

    @Override
    public int insert(Customeramount record) {
        return customeramountMapper.insert(record);
    }

    @Override
    public int insertSelective(Customeramount record) {
        return customeramountMapper.insertSelective(record);
    }

    @Override
    public Customeramount selectByPrimaryKey(String sendGoodsCustomer) {
        return customeramountMapper.selectByPrimaryKey(sendGoodsCustomer);
    }

    @Override
    public int updateByPrimaryKeySelective(Customeramount record) {
        return customeramountMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Customeramount record) {
        return customeramountMapper.updateByPrimaryKey(record);
    }

}
