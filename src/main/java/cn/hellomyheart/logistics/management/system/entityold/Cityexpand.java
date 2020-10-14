package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Cityexpand")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cityexpand implements BaseEntity {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private Integer cityId;

    @ApiModelProperty(value="")
    private String rangeCity;

    private static final long serialVersionUID = -1885901534110440370L;
}
