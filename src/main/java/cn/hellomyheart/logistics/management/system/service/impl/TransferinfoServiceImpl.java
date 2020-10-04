package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.entity.Transferinfo;
import cn.hellomyheart.logistics.management.system.mapper.TransferinfoMapper;
import cn.hellomyheart.logistics.management.system.service.TransferinfoService;
@Service
public class TransferinfoServiceImpl implements TransferinfoService{

    @Resource
    private TransferinfoMapper transferinfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return transferinfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Transferinfo record) {
        return transferinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Transferinfo record) {
        return transferinfoMapper.insertSelective(record);
    }

    @Override
    public Transferinfo selectByPrimaryKey(Integer id) {
        return transferinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Transferinfo record) {
        return transferinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Transferinfo record) {
        return transferinfoMapper.updateByPrimaryKey(record);
    }

}
