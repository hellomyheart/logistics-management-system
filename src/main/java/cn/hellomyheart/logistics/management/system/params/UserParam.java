package cn.hellomyheart.logistics.management.system.params;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * @description
 * @className: UserParam
 * @package: cn.hellomyheart.logistics.management.system.params
 * @author: Stephen Shen
 * @date: 2020/10/10 下午9:28
 */
@Data
public class UserParam implements Serializable {

    private static final long serialVersionUID = -4456715263622365964L;
    /**
     * 权限
     */
    private Set<String> roles;

    /**
     * 用户名
     */
    private String name;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 描述
     */
    private String introductin;
}
