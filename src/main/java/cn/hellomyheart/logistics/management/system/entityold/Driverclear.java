package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Driverclear")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driverclear implements BaseEntity {
    @ApiModelProperty(value="")
    private String backBillCode;

    @ApiModelProperty(value="")
    private Double addCarriage;

    @ApiModelProperty(value="")
    private Double balance;

    @ApiModelProperty(value="")
    private Date balanceTime;

    @ApiModelProperty(value="")
    private String balanceType;

    @ApiModelProperty(value="")
    private Double bindInsurance;

    @ApiModelProperty(value="")
    private Double carryFee;

    @ApiModelProperty(value="")
    private Double dispatchServiceFee;

    @ApiModelProperty(value="")
    private String driverCode;

    @ApiModelProperty(value="")
    private Double insurance;

    @ApiModelProperty(value="")
    private Double needPayment;

    @ApiModelProperty(value="")
    private Double payedMoney;

    @ApiModelProperty(value="")
    private Double prepayMoney;

    private static final long serialVersionUID = 4759465724881107509L;
}
