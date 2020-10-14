package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entity.Employeewage;
public interface EmployeewageService{


    int deleteByPrimaryKey(Integer id);

    int insert(Employeewage record);

    int insertSelective(Employeewage record);

    Employeewage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeewage record);

    int updateByPrimaryKey(Employeewage record);

}
