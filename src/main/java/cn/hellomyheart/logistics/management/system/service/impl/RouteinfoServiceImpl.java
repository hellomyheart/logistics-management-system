package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.entity.Routeinfo;
import cn.hellomyheart.logistics.management.system.mapperold.RouteinfoMapper;
import cn.hellomyheart.logistics.management.system.service.RouteinfoService;
@Service
public class RouteinfoServiceImpl implements RouteinfoService{

    @Resource
    private RouteinfoMapper routeinfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return routeinfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Routeinfo record) {
        return routeinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Routeinfo record) {
        return routeinfoMapper.insertSelective(record);
    }

    @Override
    public Routeinfo selectByPrimaryKey(Integer id) {
        return routeinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Routeinfo record) {
        return routeinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Routeinfo record) {
        return routeinfoMapper.updateByPrimaryKey(record);
    }

}
