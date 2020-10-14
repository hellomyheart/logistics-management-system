package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.hellomyheart.logistics.management.system.entity1.User;
import cn.hellomyheart.logistics.management.system.mapper.UserMapper;
import cn.hellomyheart.logistics.management.system.service.UserService;
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

}
