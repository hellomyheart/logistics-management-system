package cn.hellomyheart.logistics.management.system.serviceold.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.FunctionMapper;
import cn.hellomyheart.logistics.management.system.entityold.Function;
import cn.hellomyheart.logistics.management.system.serviceold.FunctionService;
//@Service
public class FunctionServiceImpl implements FunctionService{

    @Resource
    private FunctionMapper functionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return functionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Function record) {
        return functionMapper.insert(record);
    }

    @Override
    public int insertSelective(Function record) {
        return functionMapper.insertSelective(record);
    }

    @Override
    public Function selectByPrimaryKey(Integer id) {
        return functionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Function record) {
        return functionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Function record) {
        return functionMapper.updateByPrimaryKey(record);
    }

}
