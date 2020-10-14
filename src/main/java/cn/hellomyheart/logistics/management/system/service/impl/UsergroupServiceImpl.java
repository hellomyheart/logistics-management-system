package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.UsergroupMapper;
import cn.hellomyheart.logistics.management.system.entity.Usergroup;
import cn.hellomyheart.logistics.management.system.service.UsergroupService;
@Service
public class UsergroupServiceImpl implements UsergroupService{

    @Resource
    private UsergroupMapper usergroupMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return usergroupMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Usergroup record) {
        return usergroupMapper.insert(record);
    }

    @Override
    public int insertSelective(Usergroup record) {
        return usergroupMapper.insertSelective(record);
    }

    @Override
    public Usergroup selectByPrimaryKey(Integer id) {
        return usergroupMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Usergroup record) {
        return usergroupMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Usergroup record) {
        return usergroupMapper.updateByPrimaryKey(record);
    }

}
