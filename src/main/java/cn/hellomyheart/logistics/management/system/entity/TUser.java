package cn.hellomyheart.logistics.management.system.entity;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-TUser")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TUser implements BaseEntity {
    /**
    * 用户id
    */
    @ApiModelProperty(value="用户id")
    private Long id;

    @ApiModelProperty(value="")
    private String username;

    @ApiModelProperty(value="")
    private String password;

    /**
    * 用户姓名
    */
    @ApiModelProperty(value="用户姓名")
    private String fullname;

    /**
    * 手机号
    */
    @ApiModelProperty(value="手机号")
    private String mobile;

    private static final long serialVersionUID = 7573054896552046170L;
}
