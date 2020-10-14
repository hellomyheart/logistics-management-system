package cn.hellomyheart.logistics.management.system.entity;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Cargoreceipt")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cargoreceipt implements BaseEntity {
    @ApiModelProperty(value="")
    private String goodsRevertBillCode;

    @ApiModelProperty(value="")
    private String acceptStation;

    @ApiModelProperty(value="")
    private Double allCarriage;

    @ApiModelProperty(value="")
    private Date arriveTime;

    @ApiModelProperty(value="")
    private String backBillState;

    @ApiModelProperty(value="")
    private String carriageBanlanceMode;

    @ApiModelProperty(value="")
    private String carriageMode;

    @ApiModelProperty(value="")
    private Double carryGoodsBillDeposit;

    @ApiModelProperty(value="")
    private Double carryGoodsInsurance;

    @ApiModelProperty(value="")
    private String dealGoodsStation;

    @ApiModelProperty(value="")
    private Double dispatchServiceFee;

    @ApiModelProperty(value="")
    private String driverId;

    @ApiModelProperty(value="")
    private String ifBalance;

    @ApiModelProperty(value="")
    private Double insurance;

    @ApiModelProperty(value="")
    private String linkmanPhone;

    @ApiModelProperty(value="")
    private String loadStation;

    @ApiModelProperty(value="")
    private String receiveGoodsDetailAddr;

    @ApiModelProperty(value="")
    private String receiveGoodsLinkman;

    @ApiModelProperty(value="")
    private String remark;

    @ApiModelProperty(value="")
    private Date signTime;

    @ApiModelProperty(value="")
    private Double startAdvance;

    @ApiModelProperty(value="")
    private Date startCarryTime;

    private static final long serialVersionUID = -7289826716368118238L;
}
