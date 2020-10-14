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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Customerbillclear")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "customerbillclear")
public class Customerbillclear implements BaseEntity {
    @TableId(value = "goods_bill_code", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private String goodsBillCode;

    @TableField(value = "customer_code")
    @ApiModelProperty(value = "")
    private String customerCode;

    @TableField(value = "balance")
    @ApiModelProperty(value = "")
    private Double balance;

    @TableField(value = "balance_time")
    @ApiModelProperty(value = "")
    private Date balanceTime;

    @TableField(value = "balance_type")
    @ApiModelProperty(value = "")
    private String balanceType;

    @TableField(value = "bill_money")
    @ApiModelProperty(value = "")
    private Double billMoney;

    @TableField(value = "carriage_reduce_fund")
    @ApiModelProperty(value = "")
    private Double carriageReduceFund;

    @TableField(value = "carry_goods_fee")
    @ApiModelProperty(value = "")
    private Double carryGoodsFee;

    @TableField(value = "insurance")
    @ApiModelProperty(value = "")
    private Double insurance;

    @TableField(value = "money_receivable")
    @ApiModelProperty(value = "")
    private Double moneyReceivable;

    @TableField(value = "pay_kickback")
    @ApiModelProperty(value = "")
    private Double payKickback;

    @TableField(value = "prepay_money")
    @ApiModelProperty(value = "")
    private Double prepayMoney;

    @TableField(value = "received_money")
    @ApiModelProperty(value = "")
    private Double receivedMoney;

    private static final long serialVersionUID = 5230056364792058069L;

    public static final String COL_GOODS_BILL_CODE = "goods_bill_code";

    public static final String COL_CUSTOMER_CODE = "customer_code";

    public static final String COL_BALANCE = "balance";

    public static final String COL_BALANCE_TIME = "balance_time";

    public static final String COL_BALANCE_TYPE = "balance_type";

    public static final String COL_BILL_MONEY = "bill_money";

    public static final String COL_CARRIAGE_REDUCE_FUND = "carriage_reduce_fund";

    public static final String COL_CARRY_GOODS_FEE = "carry_goods_fee";

    public static final String COL_INSURANCE = "insurance";

    public static final String COL_MONEY_RECEIVABLE = "money_receivable";

    public static final String COL_PAY_KICKBACK = "pay_kickback";

    public static final String COL_PREPAY_MONEY = "prepay_money";

    public static final String COL_RECEIVED_MONEY = "received_money";
}
