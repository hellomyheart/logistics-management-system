package cn.hellomyheart.logistics.management.system.entity1;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Incomemonthlytemp")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "incomemonthlytemp")
public class Incomemonthlytemp implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "biz_fee")
    @ApiModelProperty(value = "")
    private Double bizFee;

    @TableField(value = "biz_income")
    @ApiModelProperty(value = "")
    private Double bizIncome;

    @TableField(value = "car_carriage")
    @ApiModelProperty(value = "")
    private Double carCarriage;

    @TableField(value = "carriage_money")
    @ApiModelProperty(value = "")
    private Double carriageMoney;

    @TableField(value = "convey_wage")
    @ApiModelProperty(value = "")
    private Double conveyWage;

    @TableField(value = "finance_fee")
    @ApiModelProperty(value = "")
    private Double financeFee;

    @TableField(value = "house_rent")
    @ApiModelProperty(value = "")
    private Double houseRent;

    @TableField(value = "income")
    @ApiModelProperty(value = "")
    private Double income;

    @TableField(value = "insurance_money")
    @ApiModelProperty(value = "")
    private Double insuranceMoney;

    @TableField(value = "manage_fee")
    @ApiModelProperty(value = "")
    private Double manageFee;

    @TableField(value = "month")
    @ApiModelProperty(value = "")
    private String month;

    @TableField(value = "office_fee")
    @ApiModelProperty(value = "")
    private Double officeFee;

    @TableField(value = "other")
    @ApiModelProperty(value = "")
    private Double other;

    @TableField(value = "payout")
    @ApiModelProperty(value = "")
    private Double payout;

    @TableField(value = "phone_fee")
    @ApiModelProperty(value = "")
    private Double phoneFee;

    @TableField(value = "profit")
    @ApiModelProperty(value = "")
    private Double profit;

    @TableField(value = "unbiz_income")
    @ApiModelProperty(value = "")
    private Double unbizIncome;

    @TableField(value = "wage")
    @ApiModelProperty(value = "")
    private Double wage;

    @TableField(value = "water_elec_fee")
    @ApiModelProperty(value = "")
    private Double waterElecFee;

    private static final long serialVersionUID = 8385580704708896155L;

    public static final String COL_ID = "id";

    public static final String COL_BIZ_FEE = "biz_fee";

    public static final String COL_BIZ_INCOME = "biz_income";

    public static final String COL_CAR_CARRIAGE = "car_carriage";

    public static final String COL_CARRIAGE_MONEY = "carriage_money";

    public static final String COL_CONVEY_WAGE = "convey_wage";

    public static final String COL_FINANCE_FEE = "finance_fee";

    public static final String COL_HOUSE_RENT = "house_rent";

    public static final String COL_INCOME = "income";

    public static final String COL_INSURANCE_MONEY = "insurance_money";

    public static final String COL_MANAGE_FEE = "manage_fee";

    public static final String COL_MONTH = "month";

    public static final String COL_OFFICE_FEE = "office_fee";

    public static final String COL_OTHER = "other";

    public static final String COL_PAYOUT = "payout";

    public static final String COL_PHONE_FEE = "phone_fee";

    public static final String COL_PROFIT = "profit";

    public static final String COL_UNBIZ_INCOME = "unbiz_income";

    public static final String COL_WAGE = "wage";

    public static final String COL_WATER_ELEC_FEE = "water_elec_fee";
}
