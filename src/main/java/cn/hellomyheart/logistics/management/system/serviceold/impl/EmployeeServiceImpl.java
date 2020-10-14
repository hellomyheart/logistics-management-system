package cn.hellomyheart.logistics.management.system.serviceold.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.EmployeeMapper;
import cn.hellomyheart.logistics.management.system.entityold.Employee;
import cn.hellomyheart.logistics.management.system.serviceold.EmployeeService;
//@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public int deleteByPrimaryKey(String employeeCode) {
        return employeeMapper.deleteByPrimaryKey(employeeCode);
    }

    @Override
    public int insert(Employee record) {
        return employeeMapper.insert(record);
    }

    @Override
    public int insertSelective(Employee record) {
        return employeeMapper.insertSelective(record);
    }

    @Override
    public Employee selectByPrimaryKey(String employeeCode) {
        return employeeMapper.selectByPrimaryKey(employeeCode);
    }

    @Override
    public int updateByPrimaryKeySelective(Employee record) {
        return employeeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Employee record) {
        return employeeMapper.updateByPrimaryKey(record);
    }

}
