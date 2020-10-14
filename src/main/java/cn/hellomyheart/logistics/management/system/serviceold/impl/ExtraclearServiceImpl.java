package cn.hellomyheart.logistics.management.system.serviceold.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.ExtraclearMapper;
import cn.hellomyheart.logistics.management.system.entityold.Extraclear;
import cn.hellomyheart.logistics.management.system.serviceold.ExtraclearService;
//@Service
public class ExtraclearServiceImpl implements ExtraclearService{

    @Resource
    private ExtraclearMapper extraclearMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return extraclearMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Extraclear record) {
        return extraclearMapper.insert(record);
    }

    @Override
    public int insertSelective(Extraclear record) {
        return extraclearMapper.insertSelective(record);
    }

    @Override
    public Extraclear selectByPrimaryKey(Integer id) {
        return extraclearMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Extraclear record) {
        return extraclearMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Extraclear record) {
        return extraclearMapper.updateByPrimaryKey(record);
    }

}
