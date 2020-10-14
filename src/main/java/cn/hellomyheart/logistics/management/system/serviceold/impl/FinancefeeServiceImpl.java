package cn.hellomyheart.logistics.management.system.serviceold.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.FinancefeeMapper;
import cn.hellomyheart.logistics.management.system.entityold.Financefee;
import cn.hellomyheart.logistics.management.system.serviceold.FinancefeeService;
//@Service
public class FinancefeeServiceImpl implements FinancefeeService{

    @Resource
    private FinancefeeMapper financefeeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return financefeeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Financefee record) {
        return financefeeMapper.insert(record);
    }

    @Override
    public int insertSelective(Financefee record) {
        return financefeeMapper.insertSelective(record);
    }

    @Override
    public Financefee selectByPrimaryKey(Integer id) {
        return financefeeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Financefee record) {
        return financefeeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Financefee record) {
        return financefeeMapper.updateByPrimaryKey(record);
    }

}
