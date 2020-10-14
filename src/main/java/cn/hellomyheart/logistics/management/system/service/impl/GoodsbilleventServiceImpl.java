package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.entity.Goodsbillevent;
import cn.hellomyheart.logistics.management.system.mapperold.GoodsbilleventMapper;
import cn.hellomyheart.logistics.management.system.service.GoodsbilleventService;
@Service
public class GoodsbilleventServiceImpl implements GoodsbilleventService{

    @Resource
    private GoodsbilleventMapper goodsbilleventMapper;

    @Override
    public int deleteByPrimaryKey(String goodsBillId) {
        return goodsbilleventMapper.deleteByPrimaryKey(goodsBillId);
    }

    @Override
    public int insert(Goodsbillevent record) {
        return goodsbilleventMapper.insert(record);
    }

    @Override
    public int insertSelective(Goodsbillevent record) {
        return goodsbilleventMapper.insertSelective(record);
    }

    @Override
    public Goodsbillevent selectByPrimaryKey(String goodsBillId) {
        return goodsbilleventMapper.selectByPrimaryKey(goodsBillId);
    }

    @Override
    public int updateByPrimaryKeySelective(Goodsbillevent record) {
        return goodsbilleventMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Goodsbillevent record) {
        return goodsbilleventMapper.updateByPrimaryKey(record);
    }

}
