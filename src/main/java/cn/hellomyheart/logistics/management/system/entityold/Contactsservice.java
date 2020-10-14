package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Contactsservice")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contactsservice implements BaseEntity {
    @ApiModelProperty(value="")
    private String sendGoodsCustomer;

    @ApiModelProperty(value="")
    private Double balance;

    @ApiModelProperty(value="")
    private Double billMoney;

    @ApiModelProperty(value="")
    private Double carriage;

    @ApiModelProperty(value="")
    private String goodsBillCode;

    @ApiModelProperty(value="")
    private Double insurance;

    @ApiModelProperty(value="")
    private Double moneyReceivable;

    @ApiModelProperty(value="")
    private String receiveGoodsAddr;

    @ApiModelProperty(value="")
    private Double receivedMoney;

    @ApiModelProperty(value="")
    private String sendGoodsAddr;

    @ApiModelProperty(value="")
    private Date sendGoodsDate;

    private static final long serialVersionUID = -8469400500010743047L;
}
