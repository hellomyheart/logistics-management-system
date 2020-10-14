package cn.hellomyheart.logistics.management.system.entity;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-TUserRole")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_user_role")
public class TUserRole implements BaseEntity {
    @TableId(value = "user_id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private String userId;

    @ApiModelProperty(value = "")
    private String roleId;

    @TableField(value = "create_time")
    @ApiModelProperty(value = "")
    private Date createTime;

    @TableField(value = "creator")
    @ApiModelProperty(value = "")
    private String creator;

    private static final long serialVersionUID = 4419825223567966931L;

    public static final String COL_USER_ID = "user_id";

    public static final String COL_ROLE_ID = "role_id";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_CREATOR = "creator";
}
