package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.entity.Incomemonthlytemp;
import cn.hellomyheart.logistics.management.system.mapperold.IncomemonthlytempMapper;
import cn.hellomyheart.logistics.management.system.service.IncomemonthlytempService;
@Service
public class IncomemonthlytempServiceImpl implements IncomemonthlytempService{

    @Resource
    private IncomemonthlytempMapper incomemonthlytempMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return incomemonthlytempMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Incomemonthlytemp record) {
        return incomemonthlytempMapper.insert(record);
    }

    @Override
    public int insertSelective(Incomemonthlytemp record) {
        return incomemonthlytempMapper.insertSelective(record);
    }

    @Override
    public Incomemonthlytemp selectByPrimaryKey(Integer id) {
        return incomemonthlytempMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Incomemonthlytemp record) {
        return incomemonthlytempMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Incomemonthlytemp record) {
        return incomemonthlytempMapper.updateByPrimaryKey(record);
    }

}
