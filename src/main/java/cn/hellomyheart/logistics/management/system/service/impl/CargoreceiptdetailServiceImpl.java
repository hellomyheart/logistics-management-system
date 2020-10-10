package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.entity.Cargoreceiptdetail;
import cn.hellomyheart.logistics.management.system.mapper.CargoreceiptdetailMapper;
import cn.hellomyheart.logistics.management.system.service.CargoreceiptdetailService;

import java.util.List;

@Service
public class CargoreceiptdetailServiceImpl implements CargoreceiptdetailService{

    @Resource
    private CargoreceiptdetailMapper cargoreceiptdetailMapper;

    @Override
    public int deleteByPrimaryKey(String goodsRevertBillId) {
        return cargoreceiptdetailMapper.deleteByPrimaryKey(goodsRevertBillId);
    }

    @Override
    public int insert(Cargoreceiptdetail record) {
        return cargoreceiptdetailMapper.insert(record);
    }

    @Override
    public int insertSelective(Cargoreceiptdetail record) {
        return cargoreceiptdetailMapper.insertSelective(record);
    }

    @Override
    public Cargoreceiptdetail selectByPrimaryKey(String goodsRevertBillId) {
        return cargoreceiptdetailMapper.selectByPrimaryKey(goodsRevertBillId);
    }

    @Override
    public List<Cargoreceiptdetail> selectAll() {
        return cargoreceiptdetailMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKeySelective(Cargoreceiptdetail record) {
        return cargoreceiptdetailMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Cargoreceiptdetail record) {
        return cargoreceiptdetailMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Cargoreceiptdetail> selectPreCode() {
        return cargoreceiptdetailMapper.selectPreCode();
    }
}
