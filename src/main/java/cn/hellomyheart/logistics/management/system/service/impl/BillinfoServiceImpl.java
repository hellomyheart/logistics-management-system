package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.entity.Billinfo;
import cn.hellomyheart.logistics.management.system.mapper.BillinfoMapper;
import cn.hellomyheart.logistics.management.system.service.BillinfoService;
@Service
public class BillinfoServiceImpl implements BillinfoService{

    @Resource
    private BillinfoMapper billinfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return billinfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Billinfo record) {
        return billinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Billinfo record) {
        return billinfoMapper.insertSelective(record);
    }

    @Override
    public Billinfo selectByPrimaryKey(Integer id) {
        return billinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Billinfo record) {
        return billinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Billinfo record) {
        return billinfoMapper.updateByPrimaryKey(record);
    }

}
