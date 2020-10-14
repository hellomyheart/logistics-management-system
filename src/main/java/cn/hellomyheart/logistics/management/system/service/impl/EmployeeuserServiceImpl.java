package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.entity.Employeeuser;
import cn.hellomyheart.logistics.management.system.mapperold.EmployeeuserMapper;
import cn.hellomyheart.logistics.management.system.service.EmployeeuserService;
@Service
public class EmployeeuserServiceImpl implements EmployeeuserService{

    @Resource
    private EmployeeuserMapper employeeuserMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return employeeuserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Employeeuser record) {
        return employeeuserMapper.insert(record);
    }

    @Override
    public int insertSelective(Employeeuser record) {
        return employeeuserMapper.insertSelective(record);
    }

    @Override
    public Employeeuser selectByPrimaryKey(Integer id) {
        return employeeuserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Employeeuser record) {
        return employeeuserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Employeeuser record) {
        return employeeuserMapper.updateByPrimaryKey(record);
    }

}
