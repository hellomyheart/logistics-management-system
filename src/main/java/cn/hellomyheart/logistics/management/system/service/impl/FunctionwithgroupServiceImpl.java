package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapper.FunctionwithgroupMapper;
import cn.hellomyheart.logistics.management.system.entity.Functionwithgroup;
import cn.hellomyheart.logistics.management.system.service.FunctionwithgroupService;
@Service
public class FunctionwithgroupServiceImpl implements FunctionwithgroupService{

    @Resource
    private FunctionwithgroupMapper functionwithgroupMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return functionwithgroupMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Functionwithgroup record) {
        return functionwithgroupMapper.insert(record);
    }

    @Override
    public int insertSelective(Functionwithgroup record) {
        return functionwithgroupMapper.insertSelective(record);
    }

    @Override
    public Functionwithgroup selectByPrimaryKey(Integer id) {
        return functionwithgroupMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Functionwithgroup record) {
        return functionwithgroupMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Functionwithgroup record) {
        return functionwithgroupMapper.updateByPrimaryKey(record);
    }

}
