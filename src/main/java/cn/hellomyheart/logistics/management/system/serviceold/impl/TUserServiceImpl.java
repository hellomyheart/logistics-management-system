package cn.hellomyheart.logistics.management.system.serviceold.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.TUserMapper;
import cn.hellomyheart.logistics.management.system.entityold.TUser;
import cn.hellomyheart.logistics.management.system.serviceold.TUserService;
//@Service
public class TUserServiceImpl implements TUserService{

    @Resource
    private TUserMapper tUserMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TUser record) {
        return tUserMapper.insert(record);
    }

    @Override
    public int insertSelective(TUser record) {
        return tUserMapper.insertSelective(record);
    }

    @Override
    public TUser selectByPrimaryKey(Long id) {
        return tUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TUser record) {
        return tUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TUser record) {
        return tUserMapper.updateByPrimaryKey(record);
    }

}
