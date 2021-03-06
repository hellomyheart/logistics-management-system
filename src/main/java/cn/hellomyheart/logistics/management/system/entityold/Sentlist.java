package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Sentlist")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sentlist implements BaseEntity {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private Double backCost;

    @ApiModelProperty(value="")
    private String carCardNo;

    @ApiModelProperty(value="")
    private Double cashPay;

    @ApiModelProperty(value="")
    private String driverName;

    @ApiModelProperty(value="")
    private String goodsCode;

    @ApiModelProperty(value="")
    private String goodsName;

    @ApiModelProperty(value="")
    private String goodsRevertBillCode;

    @ApiModelProperty(value="")
    private String helpAcceptFund;

    @ApiModelProperty(value="")
    private String mobile;

    @ApiModelProperty(value="")
    private Double pickupPay;

    @ApiModelProperty(value="")
    private Integer pieceAmount;

    @ApiModelProperty(value="")
    private String remark;

    @ApiModelProperty(value="")
    private String sendGoodsCustomer;

    @ApiModelProperty(value="")
    private String sendGoodsCustomerTel;

    @ApiModelProperty(value="")
    private String transferDestination;

    @ApiModelProperty(value="")
    private Integer userId;

    private static final long serialVersionUID = 688664323360873053L;
}
