package cn.hellomyheart.logistics.management.system.serviceold.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.EmployeewageMapper;
import cn.hellomyheart.logistics.management.system.entity.Employeewage;
import cn.hellomyheart.logistics.management.system.serviceold.EmployeewageService;
@Service
public class EmployeewageServiceImpl implements EmployeewageService{

    @Resource
    private EmployeewageMapper employeewageMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return employeewageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Employeewage record) {
        return employeewageMapper.insert(record);
    }

    @Override
    public int insertSelective(Employeewage record) {
        return employeewageMapper.insertSelective(record);
    }

    @Override
    public Employeewage selectByPrimaryKey(Integer id) {
        return employeewageMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Employeewage record) {
        return employeewageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Employeewage record) {
        return employeewageMapper.updateByPrimaryKey(record);
    }

}
