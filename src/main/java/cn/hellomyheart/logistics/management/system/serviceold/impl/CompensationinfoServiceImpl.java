package cn.hellomyheart.logistics.management.system.serviceold.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.CompensationinfoMapper;
import cn.hellomyheart.logistics.management.system.entityold.Compensationinfo;
import cn.hellomyheart.logistics.management.system.serviceold.CompensationinfoService;
//@Service
public class CompensationinfoServiceImpl implements CompensationinfoService{

    @Resource
    private CompensationinfoMapper compensationinfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return compensationinfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Compensationinfo record) {
        return compensationinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Compensationinfo record) {
        return compensationinfoMapper.insertSelective(record);
    }

    @Override
    public Compensationinfo selectByPrimaryKey(Integer id) {
        return compensationinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Compensationinfo record) {
        return compensationinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Compensationinfo record) {
        return compensationinfoMapper.updateByPrimaryKey(record);
    }

}
