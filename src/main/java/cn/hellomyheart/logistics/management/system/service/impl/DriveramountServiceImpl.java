package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.DriveramountMapper;
import cn.hellomyheart.logistics.management.system.entity.Driveramount;
import cn.hellomyheart.logistics.management.system.service.DriveramountService;
@Service
public class DriveramountServiceImpl implements DriveramountService{

    @Resource
    private DriveramountMapper driveramountMapper;

    @Override
    public int deleteByPrimaryKey(String driverCode) {
        return driveramountMapper.deleteByPrimaryKey(driverCode);
    }

    @Override
    public int insert(Driveramount record) {
        return driveramountMapper.insert(record);
    }

    @Override
    public int insertSelective(Driveramount record) {
        return driveramountMapper.insertSelective(record);
    }

    @Override
    public Driveramount selectByPrimaryKey(String driverCode) {
        return driveramountMapper.selectByPrimaryKey(driverCode);
    }

    @Override
    public int updateByPrimaryKeySelective(Driveramount record) {
        return driveramountMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Driveramount record) {
        return driveramountMapper.updateByPrimaryKey(record);
    }

}
