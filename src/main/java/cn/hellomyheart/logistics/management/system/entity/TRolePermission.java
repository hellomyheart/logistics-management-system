package cn.hellomyheart.logistics.management.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-TRolePermission")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TRolePermission implements Serializable {
    @ApiModelProperty(value="")
    private String roleId;

    @ApiModelProperty(value="")
    private String permissionId;

    private static final long serialVersionUID = 1L;
}