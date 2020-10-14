package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Functionwithgroup")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Functionwithgroup implements BaseEntity {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private Integer functionId;

    @ApiModelProperty(value="")
    private Integer groupId;

    private static final long serialVersionUID = -9163435359671002086L;
}
