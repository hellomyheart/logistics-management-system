package cn.hellomyheart.logistics.management.system.controller;

import cn.hellomyheart.logistics.management.system.commons.result.CodeMessage;
import cn.hellomyheart.logistics.management.system.commons.result.CodeStatus;
import cn.hellomyheart.logistics.management.system.commons.result.ResponseResult;
import cn.hellomyheart.logistics.management.system.entity.User;
import cn.hellomyheart.logistics.management.system.params.LoginParam;
import cn.hellomyheart.logistics.management.system.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
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

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;


    @ApiOperation(value = "登录", notes = "登录，使用Spring-security进行授权验证")
    @PostMapping("/login-success")
    public ResponseResult login(LoginParam loginParam) {
        return new ResponseResult(CodeStatus.OK, CodeMessage.LOGIN_SUCCESS, loginParam);
    }


    @ApiOperation(value = "获取登录信息", notes = "获取Spring-security的")
    @GetMapping("/info")
    public ResponseResult info() {
        return new ResponseResult(CodeStatus.OK, CodeMessage.LOGIN_SUCCESS, getUsername());
    }


    //获取当前用户的信息
    private String getUsername() {
        String username = null;
        //当前认证通过的用户身份
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object principal = authentication.getPrincipal();
        if (principal == null) {
            username = "匿名";
        }
        if (principal instanceof UserDetails) {
            UserDetails userDetails = (UserDetails) principal;
            username = userDetails.getUsername();
        } else {
            username = principal.toString();
        }
        return username;
    }

}
