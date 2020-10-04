package cn.hellomyheart.logistics.management.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Routeinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Routeinfo implements Serializable {
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

    private static final long serialVersionUID = 1L;
}