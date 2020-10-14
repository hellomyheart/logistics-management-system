package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-User")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements BaseEntity {
    @ApiModelProperty(value="")
    private String loginId;

    @ApiModelProperty(value="")
    private Boolean ifOnline;

    @ApiModelProperty(value="")
    private String password;

    private static final long serialVersionUID = -4201556742485311186L;
}
