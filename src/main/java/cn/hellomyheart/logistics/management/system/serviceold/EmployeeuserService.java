package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.Employeeuser;
public interface EmployeeuserService{


    int deleteByPrimaryKey(Integer id);

    int insert(Employeeuser record);

    int insertSelective(Employeeuser record);

    Employeeuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeeuser record);

    int updateByPrimaryKey(Employeeuser record);

}
