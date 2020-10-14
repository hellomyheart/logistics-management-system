package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.hellomyheart.logistics.management.system.entity.TUser;
import cn.hellomyheart.logistics.management.system.mapper.TUserMapper;
import cn.hellomyheart.logistics.management.system.service.TUserService;
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService{

}
