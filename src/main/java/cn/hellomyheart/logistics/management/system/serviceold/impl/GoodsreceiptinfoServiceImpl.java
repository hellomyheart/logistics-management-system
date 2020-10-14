package cn.hellomyheart.logistics.management.system.serviceold.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.GoodsreceiptinfoMapper;
import cn.hellomyheart.logistics.management.system.entityold.Goodsreceiptinfo;
import cn.hellomyheart.logistics.management.system.serviceold.GoodsreceiptinfoService;
//@Service
public class GoodsreceiptinfoServiceImpl implements GoodsreceiptinfoService{

    @Resource
    private GoodsreceiptinfoMapper goodsreceiptinfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return goodsreceiptinfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Goodsreceiptinfo record) {
        return goodsreceiptinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Goodsreceiptinfo record) {
        return goodsreceiptinfoMapper.insertSelective(record);
    }

    @Override
    public Goodsreceiptinfo selectByPrimaryKey(Integer id) {
        return goodsreceiptinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Goodsreceiptinfo record) {
        return goodsreceiptinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Goodsreceiptinfo record) {
        return goodsreceiptinfoMapper.updateByPrimaryKey(record);
    }

}
