package cn.hellomyheart.logistics.management.system.entity1;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-TRolePermission")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_role_permission")
public class TRolePermission implements BaseEntity {
    @TableId(value = "role_id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private String roleId;

    @TableId(value = "permission_id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private String permissionId;

    private static final long serialVersionUID = -2121802856357442234L;

    public static final String COL_ROLE_ID = "role_id";

    public static final String COL_PERMISSION_ID = "permission_id";
}
