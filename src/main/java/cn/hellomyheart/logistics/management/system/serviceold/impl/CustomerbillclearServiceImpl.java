package cn.hellomyheart.logistics.management.system.serviceold.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.CustomerbillclearMapper;
import cn.hellomyheart.logistics.management.system.entityold.Customerbillclear;
import cn.hellomyheart.logistics.management.system.serviceold.CustomerbillclearService;
//@Service
public class CustomerbillclearServiceImpl implements CustomerbillclearService{

    @Resource
    private CustomerbillclearMapper customerbillclearMapper;

    @Override
    public int deleteByPrimaryKey(String goodsBillCode) {
        return customerbillclearMapper.deleteByPrimaryKey(goodsBillCode);
    }

    @Override
    public int insert(Customerbillclear record) {
        return customerbillclearMapper.insert(record);
    }

    @Override
    public int insertSelective(Customerbillclear record) {
        return customerbillclearMapper.insertSelective(record);
    }

    @Override
    public Customerbillclear selectByPrimaryKey(String goodsBillCode) {
        return customerbillclearMapper.selectByPrimaryKey(goodsBillCode);
    }

    @Override
    public int updateByPrimaryKeySelective(Customerbillclear record) {
        return customerbillclearMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Customerbillclear record) {
        return customerbillclearMapper.updateByPrimaryKey(record);
    }

}
