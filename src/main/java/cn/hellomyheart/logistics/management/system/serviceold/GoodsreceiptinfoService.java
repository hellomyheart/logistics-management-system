package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entityold.Goodsreceiptinfo;
public interface GoodsreceiptinfoService{


    int deleteByPrimaryKey(Integer id);

    int insert(Goodsreceiptinfo record);

    int insertSelective(Goodsreceiptinfo record);

    Goodsreceiptinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goodsreceiptinfo record);

    int updateByPrimaryKey(Goodsreceiptinfo record);

}
