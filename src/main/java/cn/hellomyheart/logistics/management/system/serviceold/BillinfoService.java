package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entity.Billinfo;
import com.github.pagehelper.PageInfo;

public interface BillinfoService{


    int deleteByPrimaryKey(Integer id);

    int insert(Billinfo record);

    int insertSelective(Billinfo record);

    Billinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Billinfo record);

    int updateByPrimaryKey(Billinfo record);

    PageInfo<Billinfo> findNotRelease(int pageNum, int limit);

    PageInfo<Billinfo> findAll(int pageNum, int limit);
}
