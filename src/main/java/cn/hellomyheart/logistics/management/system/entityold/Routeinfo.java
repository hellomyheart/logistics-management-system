package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Routeinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Routeinfo implements BaseEntity {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private Double distance;

    @ApiModelProperty(value="")
    private Integer endStation;

    @ApiModelProperty(value="")
    private Double fetchTime;

    @ApiModelProperty(value="")
    private String passStation;

    @ApiModelProperty(value="")
    private Integer startStation;

    private static final long serialVersionUID = -2569792081765688117L;
}
