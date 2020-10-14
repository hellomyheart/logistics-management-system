package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entity.Employee;
public interface EmployeeService{


    int deleteByPrimaryKey(String employeeCode);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(String employeeCode);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

}
