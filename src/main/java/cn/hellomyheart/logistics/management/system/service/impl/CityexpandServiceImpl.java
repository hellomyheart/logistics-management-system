package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.entity.Cityexpand;
import cn.hellomyheart.logistics.management.system.mapper.CityexpandMapper;
import cn.hellomyheart.logistics.management.system.service.CityexpandService;
@Service
public class CityexpandServiceImpl implements CityexpandService{

    @Resource
    private CityexpandMapper cityexpandMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return cityexpandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Cityexpand record) {
        return cityexpandMapper.insert(record);
    }

    @Override
    public int insertSelective(Cityexpand record) {
        return cityexpandMapper.insertSelective(record);
    }

    @Override
    public Cityexpand selectByPrimaryKey(Integer id) {
        return cityexpandMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Cityexpand record) {
        return cityexpandMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Cityexpand record) {
        return cityexpandMapper.updateByPrimaryKey(record);
    }

}
