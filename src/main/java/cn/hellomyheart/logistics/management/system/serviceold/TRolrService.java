package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.TRolr;
public interface TRolrService{


    int deleteByPrimaryKey(String id);

    int insert(TRolr record);

    int insertSelective(TRolr record);

    TRolr selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TRolr record);

    int updateByPrimaryKey(TRolr record);

}
