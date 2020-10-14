package cn.hellomyheart.logistics.management.system.serviceold.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.mapperold.ComplaintinfoMapper;
import cn.hellomyheart.logistics.management.system.entity.Complaintinfo;
import cn.hellomyheart.logistics.management.system.serviceold.ComplaintinfoService;
@Service
public class ComplaintinfoServiceImpl implements ComplaintinfoService{

    @Resource
    private ComplaintinfoMapper complaintinfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return complaintinfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Complaintinfo record) {
        return complaintinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Complaintinfo record) {
        return complaintinfoMapper.insertSelective(record);
    }

    @Override
    public Complaintinfo selectByPrimaryKey(Integer id) {
        return complaintinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Complaintinfo record) {
        return complaintinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Complaintinfo record) {
        return complaintinfoMapper.updateByPrimaryKey(record);
    }

}
