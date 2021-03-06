package cn.hellomyheart.logistics.management.system.serviceold.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.TransfercominfoMapper;
import cn.hellomyheart.logistics.management.system.entityold.Transfercominfo;
import cn.hellomyheart.logistics.management.system.serviceold.TransfercominfoService;
//@Service
public class TransfercominfoServiceImpl implements TransfercominfoService{

    @Resource
    private TransfercominfoMapper transfercominfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return transfercominfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Transfercominfo record) {
        return transfercominfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Transfercominfo record) {
        return transfercominfoMapper.insertSelective(record);
    }

    @Override
    public Transfercominfo selectByPrimaryKey(Integer id) {
        return transfercominfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Transfercominfo record) {
        return transfercominfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Transfercominfo record) {
        return transfercominfoMapper.updateByPrimaryKey(record);
    }

}
