package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.entity.Driverinfo;
import cn.hellomyheart.logistics.management.system.mapper.DriverinfoMapper;
import cn.hellomyheart.logistics.management.system.service.DriverinfoService;
@Service
public class DriverinfoServiceImpl implements DriverinfoService{

    @Resource
    private DriverinfoMapper driverinfoMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return driverinfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Driverinfo record) {
        return driverinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Driverinfo record) {
        return driverinfoMapper.insertSelective(record);
    }

    @Override
    public Driverinfo selectByPrimaryKey(String id) {
        return driverinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Driverinfo record) {
        return driverinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Driverinfo record) {
        return driverinfoMapper.updateByPrimaryKey(record);
    }

}