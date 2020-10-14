package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.TRolrMapper;
import cn.hellomyheart.logistics.management.system.entity.TRolr;
import cn.hellomyheart.logistics.management.system.service.TRolrService;
@Service
public class TRolrServiceImpl implements TRolrService{

    @Resource
    private TRolrMapper tRolrMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return tRolrMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TRolr record) {
        return tRolrMapper.insert(record);
    }

    @Override
    public int insertSelective(TRolr record) {
        return tRolrMapper.insertSelective(record);
    }

    @Override
    public TRolr selectByPrimaryKey(String id) {
        return tRolrMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TRolr record) {
        return tRolrMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TRolr record) {
        return tRolrMapper.updateByPrimaryKey(record);
    }

}
