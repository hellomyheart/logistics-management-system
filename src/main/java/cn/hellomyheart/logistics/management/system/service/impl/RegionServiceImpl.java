package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.entity.Region;
import cn.hellomyheart.logistics.management.system.mapperold.RegionMapper;
import cn.hellomyheart.logistics.management.system.service.RegionService;
@Service
public class RegionServiceImpl implements RegionService{

    @Resource
    private RegionMapper regionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return regionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Region record) {
        return regionMapper.insert(record);
    }

    @Override
    public int insertSelective(Region record) {
        return regionMapper.insertSelective(record);
    }

    @Override
    public Region selectByPrimaryKey(Integer id) {
        return regionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Region record) {
        return regionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Region record) {
        return regionMapper.updateByPrimaryKey(record);
    }

}
