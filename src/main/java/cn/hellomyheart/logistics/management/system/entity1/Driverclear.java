package cn.hellomyheart.logistics.management.system.entity1;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Driverclear")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "driverclear")
public class Driverclear implements BaseEntity {
    @TableId(value = "back_bill_code", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private String backBillCode;

    @TableField(value = "add_carriage")
    @ApiModelProperty(value = "")
    private Double addCarriage;

    @TableField(value = "balance")
    @ApiModelProperty(value = "")
    private Double balance;

    @TableField(value = "balance_time")
    @ApiModelProperty(value = "")
    private Date balanceTime;

    @TableField(value = "balance_type")
    @ApiModelProperty(value = "")
    private String balanceType;

    @TableField(value = "bind_insurance")
    @ApiModelProperty(value = "")
    private Double bindInsurance;

    @TableField(value = "carry_fee")
    @ApiModelProperty(value = "")
    private Double carryFee;

    @TableField(value = "dispatch_service_fee")
    @ApiModelProperty(value = "")
    private Double dispatchServiceFee;

    @TableField(value = "driver_code")
    @ApiModelProperty(value = "")
    private String driverCode;

    @TableField(value = "insurance")
    @ApiModelProperty(value = "")
    private Double insurance;

    @TableField(value = "need_payment")
    @ApiModelProperty(value = "")
    private Double needPayment;

    @TableField(value = "payed_money")
    @ApiModelProperty(value = "")
    private Double payedMoney;

    @TableField(value = "prepay_money")
    @ApiModelProperty(value = "")
    private Double prepayMoney;

    private static final long serialVersionUID = 3116877945435259597L;

    public static final String COL_BACK_BILL_CODE = "back_bill_code";

    public static final String COL_ADD_CARRIAGE = "add_carriage";

    public static final String COL_BALANCE = "balance";

    public static final String COL_BALANCE_TIME = "balance_time";

    public static final String COL_BALANCE_TYPE = "balance_type";

    public static final String COL_BIND_INSURANCE = "bind_insurance";

    public static final String COL_CARRY_FEE = "carry_fee";

    public static final String COL_DISPATCH_SERVICE_FEE = "dispatch_service_fee";

    public static final String COL_DRIVER_CODE = "driver_code";

    public static final String COL_INSURANCE = "insurance";

    public static final String COL_NEED_PAYMENT = "need_payment";

    public static final String COL_PAYED_MONEY = "payed_money";

    public static final String COL_PREPAY_MONEY = "prepay_money";
}
