package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapper.CargoreceiptMapper;
import cn.hellomyheart.logistics.management.system.entity.Cargoreceipt;
import cn.hellomyheart.logistics.management.system.service.CargoreceiptService;

import java.util.List;

@Service
public class CargoreceiptServiceImpl implements CargoreceiptService{

    @Resource
    private CargoreceiptMapper cargoreceiptMapper;

    @Override
    public int deleteByPrimaryKey(String goodsRevertBillCode) {
        return cargoreceiptMapper.deleteByPrimaryKey(goodsRevertBillCode);
    }

    @Override
    public int insert(Cargoreceipt record) {
        return cargoreceiptMapper.insert(record);
    }

    @Override
    public int insertSelective(Cargoreceipt record) {
        return cargoreceiptMapper.insertSelective(record);
    }

    @Override
    public Cargoreceipt selectByPrimaryKey(String goodsRevertBillCode) {
        return cargoreceiptMapper.selectByPrimaryKey(goodsRevertBillCode);
    }


    @Override
    public int updateByPrimaryKeySelective(Cargoreceipt record) {
        return cargoreceiptMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Cargoreceipt record) {
        return cargoreceiptMapper.updateByPrimaryKey(record);
    }

}
