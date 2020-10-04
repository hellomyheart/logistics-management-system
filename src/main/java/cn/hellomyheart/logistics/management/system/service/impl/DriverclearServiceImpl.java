package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.entity.Driverclear;
import cn.hellomyheart.logistics.management.system.mapper.DriverclearMapper;
import cn.hellomyheart.logistics.management.system.service.DriverclearService;
@Service
public class DriverclearServiceImpl implements DriverclearService{

    @Resource
    private DriverclearMapper driverclearMapper;

    @Override
    public int deleteByPrimaryKey(String backBillCode) {
        return driverclearMapper.deleteByPrimaryKey(backBillCode);
    }

    @Override
    public int insert(Driverclear record) {
        return driverclearMapper.insert(record);
    }

    @Override
    public int insertSelective(Driverclear record) {
        return driverclearMapper.insertSelective(record);
    }

    @Override
    public Driverclear selectByPrimaryKey(String backBillCode) {
        return driverclearMapper.selectByPrimaryKey(backBillCode);
    }

    @Override
    public int updateByPrimaryKeySelective(Driverclear record) {
        return driverclearMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Driverclear record) {
        return driverclearMapper.updateByPrimaryKey(record);
    }

}
