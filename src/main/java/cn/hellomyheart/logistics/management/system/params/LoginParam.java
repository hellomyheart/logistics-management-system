package cn.hellomyheart.logistics.management.system.params;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * @description 登录参数
 * @className: LoginParam
 * @package: cn.hellomyheart.logistics.management.system.params
 * @author: Stephen Shen
 * @date: 2020/10/5 下午3:23
 */
@Data
public class LoginParam implements Serializable {

    private static final long serialVersionUID = 55940977067845812L;

    /**
     * 用户ID
     */
    private String loginId;

    /**
     * 用户密码
     */
    private String password;

}
