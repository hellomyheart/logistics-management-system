package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entity.Financefee;
public interface FinancefeeService{


    int deleteByPrimaryKey(Integer id);

    int insert(Financefee record);

    int insertSelective(Financefee record);

    Financefee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Financefee record);

    int updateByPrimaryKey(Financefee record);

}
