package cn.hellomyheart.logistics.management.system.service1.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.hellomyheart.logistics.management.system.entity1.TUser;
import cn.hellomyheart.logistics.management.system.mapper.TUserMapper;
import cn.hellomyheart.logistics.management.system.service1.TUserService;
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService{

}
