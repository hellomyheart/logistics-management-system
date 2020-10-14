package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.entity.Proxyfeeclear;
import cn.hellomyheart.logistics.management.system.mapperold.ProxyfeeclearMapper;
import cn.hellomyheart.logistics.management.system.service.ProxyfeeclearService;
@Service
public class ProxyfeeclearServiceImpl implements ProxyfeeclearService{

    @Resource
    private ProxyfeeclearMapper proxyfeeclearMapper;

    @Override
    public int deleteByPrimaryKey(String goodsBillCode) {
        return proxyfeeclearMapper.deleteByPrimaryKey(goodsBillCode);
    }

    @Override
    public int insert(Proxyfeeclear record) {
        return proxyfeeclearMapper.insert(record);
    }

    @Override
    public int insertSelective(Proxyfeeclear record) {
        return proxyfeeclearMapper.insertSelective(record);
    }

    @Override
    public Proxyfeeclear selectByPrimaryKey(String goodsBillCode) {
        return proxyfeeclearMapper.selectByPrimaryKey(goodsBillCode);
    }

    @Override
    public int updateByPrimaryKeySelective(Proxyfeeclear record) {
        return proxyfeeclearMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Proxyfeeclear record) {
        return proxyfeeclearMapper.updateByPrimaryKey(record);
    }

}
