package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Customeramount")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customeramount implements BaseEntity {
    @ApiModelProperty(value="")
    private String sendGoodsCustomer;

    @ApiModelProperty(value="")
    private Double carriageTotal;

    @ApiModelProperty(value="")
    private Double insuranceTotal;

    @ApiModelProperty(value="")
    private Integer pieceAmountTotal;

    private static final long serialVersionUID = 2817073993664514417L;
}
