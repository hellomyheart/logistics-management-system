package cn.hellomyheart.logistics.management.system.serviceold.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.LineoverallMapper;
import cn.hellomyheart.logistics.management.system.entityold.Lineoverall;
import cn.hellomyheart.logistics.management.system.serviceold.LineoverallService;
//@Service
public class LineoverallServiceImpl implements LineoverallService{

    @Resource
    private LineoverallMapper lineoverallMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return lineoverallMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Lineoverall record) {
        return lineoverallMapper.insert(record);
    }

    @Override
    public int insertSelective(Lineoverall record) {
        return lineoverallMapper.insertSelective(record);
    }

    @Override
    public Lineoverall selectByPrimaryKey(Integer id) {
        return lineoverallMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Lineoverall record) {
        return lineoverallMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Lineoverall record) {
        return lineoverallMapper.updateByPrimaryKey(record);
    }

}
