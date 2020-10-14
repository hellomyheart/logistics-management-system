package cn.hellomyheart.logistics.management.system.entity;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-User")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "`user`")
public class User implements BaseEntity {
    @TableId(value = "login_id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private String loginId;

    @TableField(value = "if_online")
    @ApiModelProperty(value = "")
    private Boolean ifOnline;

    @TableField(value = "password")
    @ApiModelProperty(value = "")
    private String password;

    private static final long serialVersionUID = 51532072968367493L;

    public static final String COL_LOGIN_ID = "login_id";

    public static final String COL_IF_ONLINE = "if_online";

    public static final String COL_PASSWORD = "password";
}
