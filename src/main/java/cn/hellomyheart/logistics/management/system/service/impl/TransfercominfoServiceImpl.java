package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapper.TransfercominfoMapper;
import cn.hellomyheart.logistics.management.system.entity.Transfercominfo;
import cn.hellomyheart.logistics.management.system.service.TransfercominfoService;
@Service
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
