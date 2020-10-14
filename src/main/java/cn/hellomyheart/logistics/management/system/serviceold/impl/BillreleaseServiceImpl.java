package cn.hellomyheart.logistics.management.system.serviceold.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.BillreleaseMapper;
import cn.hellomyheart.logistics.management.system.entity.Billrelease;
import cn.hellomyheart.logistics.management.system.serviceold.BillreleaseService;
@Service
public class BillreleaseServiceImpl implements BillreleaseService{

    @Resource
    private BillreleaseMapper billreleaseMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return billreleaseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Billrelease record) {
        return billreleaseMapper.insert(record);
    }

    @Override
    public int insertSelective(Billrelease record) {
        return billreleaseMapper.insertSelective(record);
    }

    @Override
    public Billrelease selectByPrimaryKey(Integer id) {
        return billreleaseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Billrelease record) {
        return billreleaseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Billrelease record) {
        return billreleaseMapper.updateByPrimaryKey(record);
    }

}
