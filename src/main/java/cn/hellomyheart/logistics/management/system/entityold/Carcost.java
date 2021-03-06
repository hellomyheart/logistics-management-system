package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Carcost")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carcost implements BaseEntity {
    @ApiModelProperty(value="")
    private String driverCode;

    @ApiModelProperty(value="")
    private Double addCarriageTotal;

    @ApiModelProperty(value="")
    private Double allowCarryWeight;

    @ApiModelProperty(value="")
    private String backBillCode;

    @ApiModelProperty(value="")
    private Date balanceTime;

    @ApiModelProperty(value="")
    private String carNo;

    @ApiModelProperty(value="")
    private String carType;

    @ApiModelProperty(value="")
    private String carWidth;

    @ApiModelProperty(value="")
    private Double carryFeeTotal;

    @ApiModelProperty(value="")
    private String dealGoodsStation;

    @ApiModelProperty(value="")
    private Double factCarriageTotal;

    @ApiModelProperty(value="")
    private String goodsHeight;

    @ApiModelProperty(value="")
    private String loadStation;

    private static final long serialVersionUID = -5028452415341694811L;
}
