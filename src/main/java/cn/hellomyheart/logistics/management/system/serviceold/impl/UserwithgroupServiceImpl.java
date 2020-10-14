package cn.hellomyheart.logistics.management.system.serviceold.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.entity.Userwithgroup;
import cn.hellomyheart.logistics.management.system.mapperold.UserwithgroupMapper;
import cn.hellomyheart.logistics.management.system.serviceold.UserwithgroupService;
@Service
public class UserwithgroupServiceImpl implements UserwithgroupService{

    @Resource
    private UserwithgroupMapper userwithgroupMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userwithgroupMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Userwithgroup record) {
        return userwithgroupMapper.insert(record);
    }

    @Override
    public int insertSelective(Userwithgroup record) {
        return userwithgroupMapper.insertSelective(record);
    }

    @Override
    public Userwithgroup selectByPrimaryKey(Integer id) {
        return userwithgroupMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Userwithgroup record) {
        return userwithgroupMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Userwithgroup record) {
        return userwithgroupMapper.updateByPrimaryKey(record);
    }

}
