package cn.hellomyheart.logistics.management.system.entity;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Incomemonthlytemp")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Incomemonthlytemp implements BaseEntity {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private Double bizFee;

    @ApiModelProperty(value="")
    private Double bizIncome;

    @ApiModelProperty(value="")
    private Double carCarriage;

    @ApiModelProperty(value="")
    private Double carriageMoney;

    @ApiModelProperty(value="")
    private Double conveyWage;

    @ApiModelProperty(value="")
    private Double financeFee;

    @ApiModelProperty(value="")
    private Double houseRent;

    @ApiModelProperty(value="")
    private Double income;

    @ApiModelProperty(value="")
    private Double insuranceMoney;

    @ApiModelProperty(value="")
    private Double manageFee;

    @ApiModelProperty(value="")
    private String month;

    @ApiModelProperty(value="")
    private Double officeFee;

    @ApiModelProperty(value="")
    private Double other;

    @ApiModelProperty(value="")
    private Double payout;

    @ApiModelProperty(value="")
    private Double phoneFee;

    @ApiModelProperty(value="")
    private Double profit;

    @ApiModelProperty(value="")
    private Double unbizIncome;

    @ApiModelProperty(value="")
    private Double wage;

    @ApiModelProperty(value="")
    private Double waterElecFee;

    private static final long serialVersionUID = 8654358230024142947L;
}
