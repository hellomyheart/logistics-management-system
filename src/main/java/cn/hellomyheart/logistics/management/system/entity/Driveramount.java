package cn.hellomyheart.logistics.management.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Driveramount")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driveramount implements Serializable {
    @ApiModelProperty(value="")
    private String driverCode;

    @ApiModelProperty(value="")
    private Double addCarriageTotal;

    @ApiModelProperty(value="")
    private Double carryFeeTotal;

    @ApiModelProperty(value="")
    private Double total;

    private static final long serialVersionUID = 1L;
}