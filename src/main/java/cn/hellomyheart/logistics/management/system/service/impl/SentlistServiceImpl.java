package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.entity.Sentlist;
import cn.hellomyheart.logistics.management.system.mapperold.SentlistMapper;
import cn.hellomyheart.logistics.management.system.service.SentlistService;
@Service
public class SentlistServiceImpl implements SentlistService{

    @Resource
    private SentlistMapper sentlistMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sentlistMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Sentlist record) {
        return sentlistMapper.insert(record);
    }

    @Override
    public int insertSelective(Sentlist record) {
        return sentlistMapper.insertSelective(record);
    }

    @Override
    public Sentlist selectByPrimaryKey(Integer id) {
        return sentlistMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Sentlist record) {
        return sentlistMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Sentlist record) {
        return sentlistMapper.updateByPrimaryKey(record);
    }

}
