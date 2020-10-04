package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapper.ManagefeeMapper;
import cn.hellomyheart.logistics.management.system.entity.Managefee;
import cn.hellomyheart.logistics.management.system.service.ManagefeeService;
@Service
public class ManagefeeServiceImpl implements ManagefeeService{

    @Resource
    private ManagefeeMapper managefeeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return managefeeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Managefee record) {
        return managefeeMapper.insert(record);
    }

    @Override
    public int insertSelective(Managefee record) {
        return managefeeMapper.insertSelective(record);
    }

    @Override
    public Managefee selectByPrimaryKey(Integer id) {
        return managefeeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Managefee record) {
        return managefeeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Managefee record) {
        return managefeeMapper.updateByPrimaryKey(record);
    }

}
