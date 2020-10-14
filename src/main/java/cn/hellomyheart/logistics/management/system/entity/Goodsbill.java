package cn.hellomyheart.logistics.management.system.entity;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Goodsbill")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "goodsbill")
public class Goodsbill implements BaseEntity {
    @TableId(value = "goods_bill_code", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private String goodsBillCode;

    @TableField(value = "accept_procedure_rate")
    @ApiModelProperty(value = "")
    private String acceptProcedureRate;

    @TableField(value = "accept_station")
    @ApiModelProperty(value = "")
    private String acceptStation;

    @TableField(value = "carriage")
    @ApiModelProperty(value = "")
    private Double carriage;

    @TableField(value = "carry_goods_fee")
    @ApiModelProperty(value = "")
    private Double carryGoodsFee;

    @TableField(value = "employee_code")
    @ApiModelProperty(value = "")
    private String employeeCode;

    @TableField(value = "fact_deal_date")
    @ApiModelProperty(value = "")
    private Date factDealDate;

    @TableField(value = "fetch_goods_mode")
    @ApiModelProperty(value = "")
    private String fetchGoodsMode;

    @TableField(value = "help_accept_payment")
    @ApiModelProperty(value = "")
    private Double helpAcceptPayment;

    @TableField(value = "if_audit")
    @ApiModelProperty(value = "")
    private Boolean ifAudit;

    @TableField(value = "if_settle_accounts")
    @ApiModelProperty(value = "")
    private Boolean ifSettleAccounts;

    @TableField(value = "insurance")
    @ApiModelProperty(value = "")
    private Double insurance;

    @TableField(value = "money_of_change_pay")
    @ApiModelProperty(value = "")
    private Double moneyOfChangePay;

    @TableField(value = "pay_kickback")
    @ApiModelProperty(value = "")
    private Double payKickback;

    @TableField(value = "pay_mode")
    @ApiModelProperty(value = "")
    private String payMode;

    @TableField(value = "predelivery_date")
    @ApiModelProperty(value = "")
    private Date predeliveryDate;

    @TableField(value = "receive_goods_addr")
    @ApiModelProperty(value = "")
    private String receiveGoodsAddr;

    @TableField(value = "receive_goods_customer")
    @ApiModelProperty(value = "")
    private String receiveGoodsCustomer;

    @TableField(value = "receive_goods_customer_addr")
    @ApiModelProperty(value = "")
    private String receiveGoodsCustomerAddr;

    @TableField(value = "receive_goods_customer_code")
    @ApiModelProperty(value = "")
    private String receiveGoodsCustomerCode;

    @TableField(value = "receive_goods_customer_tel")
    @ApiModelProperty(value = "")
    private String receiveGoodsCustomerTel;

    @TableField(value = "reduce_fund")
    @ApiModelProperty(value = "")
    private Double reduceFund;

    @TableField(value = "remark")
    @ApiModelProperty(value = "")
    private String remark;

    @TableField(value = "send_goods_addr")
    @ApiModelProperty(value = "")
    private String sendGoodsAddr;

    @TableField(value = "send_goods_customer")
    @ApiModelProperty(value = "")
    private String sendGoodsCustomer;

    @TableField(value = "send_goods_customer_addr")
    @ApiModelProperty(value = "")
    private String sendGoodsCustomerAddr;

    @TableField(value = "send_goods_customer_no")
    @ApiModelProperty(value = "")
    private String sendGoodsCustomerNo;

    @TableField(value = "send_goods_customer_tel")
    @ApiModelProperty(value = "")
    private String sendGoodsCustomerTel;

    @TableField(value = "send_goods_date")
    @ApiModelProperty(value = "")
    private Date sendGoodsDate;

    @TableField(value = "transfer_fee")
    @ApiModelProperty(value = "")
    private Double transferFee;

    @TableField(value = "transfer_station")
    @ApiModelProperty(value = "")
    private String transferStation;

    @TableField(value = "validity")
    @ApiModelProperty(value = "")
    private Boolean validity;

    @TableField(value = "write_bill_person")
    @ApiModelProperty(value = "")
    private String writeBillPerson;

    @TableField(value = "write_date")
    @ApiModelProperty(value = "")
    private Date writeDate;

    private static final long serialVersionUID = 6750623057623029615L;

    public static final String COL_GOODS_BILL_CODE = "goods_bill_code";

    public static final String COL_ACCEPT_PROCEDURE_RATE = "accept_procedure_rate";

    public static final String COL_ACCEPT_STATION = "accept_station";

    public static final String COL_CARRIAGE = "carriage";

    public static final String COL_CARRY_GOODS_FEE = "carry_goods_fee";

    public static final String COL_EMPLOYEE_CODE = "employee_code";

    public static final String COL_FACT_DEAL_DATE = "fact_deal_date";

    public static final String COL_FETCH_GOODS_MODE = "fetch_goods_mode";

    public static final String COL_HELP_ACCEPT_PAYMENT = "help_accept_payment";

    public static final String COL_IF_AUDIT = "if_audit";

    public static final String COL_IF_SETTLE_ACCOUNTS = "if_settle_accounts";

    public static final String COL_INSURANCE = "insurance";

    public static final String COL_MONEY_OF_CHANGE_PAY = "money_of_change_pay";

    public static final String COL_PAY_KICKBACK = "pay_kickback";

    public static final String COL_PAY_MODE = "pay_mode";

    public static final String COL_PREDELIVERY_DATE = "predelivery_date";

    public static final String COL_RECEIVE_GOODS_ADDR = "receive_goods_addr";

    public static final String COL_RECEIVE_GOODS_CUSTOMER = "receive_goods_customer";

    public static final String COL_RECEIVE_GOODS_CUSTOMER_ADDR = "receive_goods_customer_addr";

    public static final String COL_RECEIVE_GOODS_CUSTOMER_CODE = "receive_goods_customer_code";

    public static final String COL_RECEIVE_GOODS_CUSTOMER_TEL = "receive_goods_customer_tel";

    public static final String COL_REDUCE_FUND = "reduce_fund";

    public static final String COL_REMARK = "remark";

    public static final String COL_SEND_GOODS_ADDR = "send_goods_addr";

    public static final String COL_SEND_GOODS_CUSTOMER = "send_goods_customer";

    public static final String COL_SEND_GOODS_CUSTOMER_ADDR = "send_goods_customer_addr";

    public static final String COL_SEND_GOODS_CUSTOMER_NO = "send_goods_customer_no";

    public static final String COL_SEND_GOODS_CUSTOMER_TEL = "send_goods_customer_tel";

    public static final String COL_SEND_GOODS_DATE = "send_goods_date";

    public static final String COL_TRANSFER_FEE = "transfer_fee";

    public static final String COL_TRANSFER_STATION = "transfer_station";

    public static final String COL_VALIDITY = "validity";

    public static final String COL_WRITE_BILL_PERSON = "write_bill_person";

    public static final String COL_WRITE_DATE = "write_date";
}
