package cn.hellomyheart.logistics.management.system.serviceold.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.GoodsbillMapper;
import cn.hellomyheart.logistics.management.system.entityold.Goodsbill;
import cn.hellomyheart.logistics.management.system.serviceold.GoodsbillService;
//@Service
public class GoodsbillServiceImpl implements GoodsbillService{

    @Resource
    private GoodsbillMapper goodsbillMapper;

    @Override
    public int deleteByPrimaryKey(String goodsBillCode) {
        return goodsbillMapper.deleteByPrimaryKey(goodsBillCode);
    }

    @Override
    public int insert(Goodsbill record) {
        return goodsbillMapper.insert(record);
    }

    @Override
    public int insertSelective(Goodsbill record) {
        return goodsbillMapper.insertSelective(record);
    }

    @Override
    public Goodsbill selectByPrimaryKey(String goodsBillCode) {
        return goodsbillMapper.selectByPrimaryKey(goodsBillCode);
    }

    @Override
    public int updateByPrimaryKeySelective(Goodsbill record) {
        return goodsbillMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Goodsbill record) {
        return goodsbillMapper.updateByPrimaryKey(record);
    }

}
