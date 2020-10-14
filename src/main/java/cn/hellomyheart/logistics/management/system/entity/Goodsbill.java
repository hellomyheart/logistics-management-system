package cn.hellomyheart.logistics.management.system.entity;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Goodsbill")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goodsbill implements BaseEntity {
    @ApiModelProperty(value="")
    private String goodsBillCode;

    @ApiModelProperty(value="")
    private String acceptProcedureRate;

    @ApiModelProperty(value="")
    private String acceptStation;

    @ApiModelProperty(value="")
    private Double carriage;

    @ApiModelProperty(value="")
    private Double carryGoodsFee;

    @ApiModelProperty(value="")
    private String employeeCode;

    @ApiModelProperty(value="")
    private Date factDealDate;

    @ApiModelProperty(value="")
    private String fetchGoodsMode;

    @ApiModelProperty(value="")
    private Double helpAcceptPayment;

    @ApiModelProperty(value="")
    private Boolean ifAudit;

    @ApiModelProperty(value="")
    private Boolean ifSettleAccounts;

    @ApiModelProperty(value="")
    private Double insurance;

    @ApiModelProperty(value="")
    private Double moneyOfChangePay;

    @ApiModelProperty(value="")
    private Double payKickback;

    @ApiModelProperty(value="")
    private String payMode;

    @ApiModelProperty(value="")
    private Date predeliveryDate;

    @ApiModelProperty(value="")
    private String receiveGoodsAddr;

    @ApiModelProperty(value="")
    private String receiveGoodsCustomer;

    @ApiModelProperty(value="")
    private String receiveGoodsCustomerAddr;

    @ApiModelProperty(value="")
    private String receiveGoodsCustomerCode;

    @ApiModelProperty(value="")
    private String receiveGoodsCustomerTel;

    @ApiModelProperty(value="")
    private Double reduceFund;

    @ApiModelProperty(value="")
    private String remark;

    @ApiModelProperty(value="")
    private String sendGoodsAddr;

    @ApiModelProperty(value="")
    private String sendGoodsCustomer;

    @ApiModelProperty(value="")
    private String sendGoodsCustomerAddr;

    @ApiModelProperty(value="")
    private String sendGoodsCustomerNo;

    @ApiModelProperty(value="")
    private String sendGoodsCustomerTel;

    @ApiModelProperty(value="")
    private Date sendGoodsDate;

    @ApiModelProperty(value="")
    private Double transferFee;

    @ApiModelProperty(value="")
    private String transferStation;

    @ApiModelProperty(value="")
    private Boolean validity;

    @ApiModelProperty(value="")
    private String writeBillPerson;

    @ApiModelProperty(value="")
    private Date writeDate;

    private static final long serialVersionUID = -5354868117079335420L;
}
