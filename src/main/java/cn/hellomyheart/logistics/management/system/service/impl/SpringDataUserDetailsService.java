package cn.hellomyheart.logistics.management.system.service.impl;

import cn.hellomyheart.logistics.management.system.entity.TPermission;
import cn.hellomyheart.logistics.management.system.entity.TUser;
import cn.hellomyheart.logistics.management.system.mapper.TPermissionMapper;
import cn.hellomyheart.logistics.management.system.mapper.TUserMapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @className: SpringDataUserDetailsService
 * @package: cn.hellomyheart.logistics.management.system.service.impl
 * @author: Stephen Shen
 * @date: 2020/10/9 下午3:14
 */
@Service
public class SpringDataUserDetailsService implements UserDetailsService {

    @Resource
    private TUserMapper tUserMapper;

    @Resource
    private TPermissionMapper tPermissionMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //连接数据库，根据账号查询用户信息
        //登录账号
//        TUser tUser = tUserMapper.selectUserByUsername(s);
        TUser tUserData =new TUser();
        tUserData.setUsername(s);
        QueryWrapper<TUser> queryWrapper = new QueryWrapper<>(tUserData);
        TUser tUser = tUserMapper.selectOne(queryWrapper);

        if (tUser == null) {
            //如果用户查询不到，返回null，由provider来抛异常。
            return null;
        }
        //根据用户id查询用户权限
        List<TPermission> tPermissions = tPermissionMapper.selectPermissionsByUserId(tUser.getId().toString());

        List<String> permissions = new ArrayList<>();
        tPermissions.iterator().forEachRemaining(c -> permissions.add(c.getCode()));

        //将permissions转成数组
        String[] permissionsArray = new String[permissions.size()];
        permissions.toArray(permissionsArray);
        UserDetails userDetails = User.withUsername(tUser.getUsername()).password(tUser.getPassword()).authorities(permissionsArray).build();
        return userDetails;
    }

}
