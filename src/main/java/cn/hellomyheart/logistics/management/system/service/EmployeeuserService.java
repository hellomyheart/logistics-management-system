package cn.hellomyheart.logistics.management.system.service;

import cn.hellomyheart.logistics.management.system.entity.Employeeuser;
public interface EmployeeuserService{


    int deleteByPrimaryKey(Integer id);

    int insert(Employeeuser record);

    int insertSelective(Employeeuser record);

    Employeeuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeeuser record);

    int updateByPrimaryKey(Employeeuser record);

}
