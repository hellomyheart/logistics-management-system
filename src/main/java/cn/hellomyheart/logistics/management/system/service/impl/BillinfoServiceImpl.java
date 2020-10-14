package cn.hellomyheart.logistics.management.system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.entity.Billinfo;
import cn.hellomyheart.logistics.management.system.mapperold.BillinfoMapper;
import cn.hellomyheart.logistics.management.system.service.BillinfoService;

import java.util.List;

@Service
public class BillinfoServiceImpl implements BillinfoService{

    @Resource
    private BillinfoMapper billinfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return billinfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Billinfo record) {
        return billinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Billinfo record) {
        return billinfoMapper.insertSelective(record);
    }

    @Override
    public Billinfo selectByPrimaryKey(Integer id) {
        return billinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Billinfo record) {
        return billinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Billinfo record) {
        return billinfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<Billinfo> findNotRelease(int pageNum, int limit) {
        PageHelper.startPage(pageNum,limit);//这行是重点，表示从pageNum页开始，每页pageSize条数据
        List<Billinfo> list = billinfoMapper.findNotRelease();
        return new PageInfo<Billinfo>(list);
    }

    @Override
    public PageInfo<Billinfo> findAll(int pageNum, int limit) {
        PageHelper.startPage(pageNum,limit);//这行是重点，表示从pageNum页开始，每页pageSize条数据
        List<Billinfo> list =billinfoMapper.findAll();
        return new PageInfo<Billinfo>(list);
    }
}
