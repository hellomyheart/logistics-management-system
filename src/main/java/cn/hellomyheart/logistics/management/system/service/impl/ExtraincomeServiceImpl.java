package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.ExtraincomeMapper;
import cn.hellomyheart.logistics.management.system.entity.Extraincome;
import cn.hellomyheart.logistics.management.system.service.ExtraincomeService;
@Service
public class ExtraincomeServiceImpl implements ExtraincomeService{

    @Resource
    private ExtraincomeMapper extraincomeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return extraincomeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Extraincome record) {
        return extraincomeMapper.insert(record);
    }

    @Override
    public int insertSelective(Extraincome record) {
        return extraincomeMapper.insertSelective(record);
    }

    @Override
    public Extraincome selectByPrimaryKey(Integer id) {
        return extraincomeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Extraincome record) {
        return extraincomeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Extraincome record) {
        return extraincomeMapper.updateByPrimaryKey(record);
    }

}
