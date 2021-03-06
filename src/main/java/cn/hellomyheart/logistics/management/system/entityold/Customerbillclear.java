package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Customerbillclear")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customerbillclear implements BaseEntity {
    @ApiModelProperty(value="")
    private String goodsBillCode;

    @ApiModelProperty(value="")
    private String customerCode;

    @ApiModelProperty(value="")
    private Double balance;

    @ApiModelProperty(value="")
    private Date balanceTime;

    @ApiModelProperty(value="")
    private String balanceType;

    @ApiModelProperty(value="")
    private Double billMoney;

    @ApiModelProperty(value="")
    private Double carriageReduceFund;

    @ApiModelProperty(value="")
    private Double carryGoodsFee;

    @ApiModelProperty(value="")
    private Double insurance;

    @ApiModelProperty(value="")
    private Double moneyReceivable;

    @ApiModelProperty(value="")
    private Double payKickback;

    @ApiModelProperty(value="")
    private Double prepayMoney;

    @ApiModelProperty(value="")
    private Double receivedMoney;

    private static final long serialVersionUID = -1885196596423629623L;
}
