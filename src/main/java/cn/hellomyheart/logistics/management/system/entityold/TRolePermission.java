package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-TRolePermission")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TRolePermission implements BaseEntity {
    @ApiModelProperty(value="")
    private String roleId;

    @ApiModelProperty(value="")
    private String permissionId;

    private static final long serialVersionUID = -3242154586460930186L;
}
