package cn.hellomyheart.logistics.management.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Customeramount")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customeramount implements Serializable {
    @ApiModelProperty(value="")
    private String sendGoodsCustomer;

    @ApiModelProperty(value="")
    private Double carriageTotal;

    @ApiModelProperty(value="")
    private Double insuranceTotal;

    @ApiModelProperty(value="")
    private Integer pieceAmountTotal;

    private static final long serialVersionUID = 1L;
}