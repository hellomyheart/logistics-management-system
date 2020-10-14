package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.entity.TUserRole;
import cn.hellomyheart.logistics.management.system.mapperold.TUserRoleMapper;
import cn.hellomyheart.logistics.management.system.service.TUserRoleService;
@Service
public class TUserRoleServiceImpl implements TUserRoleService{

    @Resource
    private TUserRoleMapper tUserRoleMapper;

    @Override
    public int deleteByPrimaryKey(String userId,String roleId) {
        return tUserRoleMapper.deleteByPrimaryKey(userId,roleId);
    }

    @Override
    public int insert(TUserRole record) {
        return tUserRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(TUserRole record) {
        return tUserRoleMapper.insertSelective(record);
    }

    @Override
    public TUserRole selectByPrimaryKey(String userId,String roleId) {
        return tUserRoleMapper.selectByPrimaryKey(userId,roleId);
    }

    @Override
    public int updateByPrimaryKeySelective(TUserRole record) {
        return tUserRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TUserRole record) {
        return tUserRoleMapper.updateByPrimaryKey(record);
    }

}
