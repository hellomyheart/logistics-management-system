package cn.hellomyheart.logistics.management.system.serviceold.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.logistics.management.system.entityold.Callbackinfo;
import cn.hellomyheart.logistics.management.system.mapperold.CallbackinfoMapper;
import cn.hellomyheart.logistics.management.system.serviceold.CallbackinfoService;

import java.util.HashMap;
import java.util.Map;

//@Service
public class CallbackinfoServiceImpl implements CallbackinfoService{


    @Resource
    private CallbackinfoMapper callbackinfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return callbackinfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Callbackinfo record) {
        return callbackinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Callbackinfo record) {
        return callbackinfoMapper.insertSelective(record);
    }

    @Override
    public Callbackinfo selectByPrimaryKey(Integer id) {
        return callbackinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Callbackinfo record) {
        return callbackinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Callbackinfo record) {
        return callbackinfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public Callbackinfo selectByDetails(String goodsBillId, String type) {
        Map map= new HashMap<String,String>();
        map.put("goodsBillId",goodsBillId);
        map.put("type",type);

        return callbackinfoMapper.selectByDetails(map);
    }
}
