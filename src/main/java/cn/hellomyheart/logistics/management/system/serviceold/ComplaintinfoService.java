package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entity.Complaintinfo;
public interface ComplaintinfoService{


    int deleteByPrimaryKey(Integer id);

    int insert(Complaintinfo record);

    int insertSelective(Complaintinfo record);

    Complaintinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Complaintinfo record);

    int updateByPrimaryKey(Complaintinfo record);

}
