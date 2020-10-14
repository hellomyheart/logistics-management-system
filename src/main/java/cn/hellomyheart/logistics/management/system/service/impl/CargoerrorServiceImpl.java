package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.CargoerrorMapper;
import cn.hellomyheart.logistics.management.system.entity.Cargoerror;
import cn.hellomyheart.logistics.management.system.service.CargoerrorService;
@Service
public class CargoerrorServiceImpl implements CargoerrorService{

    @Resource
    private CargoerrorMapper cargoerrorMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return cargoerrorMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Cargoerror record) {
        return cargoerrorMapper.insert(record);
    }

    @Override
    public int insertSelective(Cargoerror record) {
        return cargoerrorMapper.insertSelective(record);
    }

    @Override
    public Cargoerror selectByPrimaryKey(Integer id) {
        return cargoerrorMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Cargoerror record) {
        return cargoerrorMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Cargoerror record) {
        return cargoerrorMapper.updateByPrimaryKey(record);
    }

}
