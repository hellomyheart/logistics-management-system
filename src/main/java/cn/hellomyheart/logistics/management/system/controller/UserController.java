package cn.hellomyheart.logistics.management.system.controller;

import cn.hellomyheart.logistics.management.system.entity.User;
import cn.hellomyheart.logistics.management.system.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description 用户控制器
 * @className: UserController
 * @package: cn.hellomyheart.logistics.management.system.controller
 * @author: Stephen Shen
 * @date: 2020/10/5 上午11:10
 */

@RestController
@Api(value = "用户管理")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(String loginId,String password){
        User user = userService.selectByPrimaryKey(loginId);

        return "hello";
    }

}
