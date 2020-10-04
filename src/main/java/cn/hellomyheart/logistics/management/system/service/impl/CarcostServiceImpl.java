package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapper.CarcostMapper;
import cn.hellomyheart.logistics.management.system.entity.Carcost;
import cn.hellomyheart.logistics.management.system.service.CarcostService;
@Service
public class CarcostServiceImpl implements CarcostService{

    @Resource
    private CarcostMapper carcostMapper;

    @Override
    public int deleteByPrimaryKey(String driverCode) {
        return carcostMapper.deleteByPrimaryKey(driverCode);
    }

    @Override
    public int insert(Carcost record) {
        return carcostMapper.insert(record);
    }

    @Override
    public int insertSelective(Carcost record) {
        return carcostMapper.insertSelective(record);
    }

    @Override
    public Carcost selectByPrimaryKey(String driverCode) {
        return carcostMapper.selectByPrimaryKey(driverCode);
    }

    @Override
    public int updateByPrimaryKeySelective(Carcost record) {
        return carcostMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Carcost record) {
        return carcostMapper.updateByPrimaryKey(record);
    }

}
