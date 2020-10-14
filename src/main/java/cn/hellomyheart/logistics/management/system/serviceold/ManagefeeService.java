package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.Managefee;
public interface ManagefeeService{


    int deleteByPrimaryKey(Integer id);

    int insert(Managefee record);

    int insertSelective(Managefee record);

    Managefee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Managefee record);

    int updateByPrimaryKey(Managefee record);

}
