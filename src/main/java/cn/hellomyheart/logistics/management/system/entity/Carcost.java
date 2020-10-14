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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Carcost")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "carcost")
public class Carcost implements BaseEntity {
    @TableId(value = "driver_code", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private String driverCode;

    @TableField(value = "add_carriage_total")
    @ApiModelProperty(value = "")
    private Double addCarriageTotal;

    @TableField(value = "allow_carry_weight")
    @ApiModelProperty(value = "")
    private Double allowCarryWeight;

    @TableField(value = "back_bill_code")
    @ApiModelProperty(value = "")
    private String backBillCode;

    @TableField(value = "balance_time")
    @ApiModelProperty(value = "")
    private Date balanceTime;

    @TableField(value = "car_no")
    @ApiModelProperty(value = "")
    private String carNo;

    @TableField(value = "car_type")
    @ApiModelProperty(value = "")
    private String carType;

    @TableField(value = "car_width")
    @ApiModelProperty(value = "")
    private String carWidth;

    @TableField(value = "carry_fee_total")
    @ApiModelProperty(value = "")
    private Double carryFeeTotal;

    @TableField(value = "deal_goods_station")
    @ApiModelProperty(value = "")
    private String dealGoodsStation;

    @TableField(value = "fact_carriage_total")
    @ApiModelProperty(value = "")
    private Double factCarriageTotal;

    @TableField(value = "goods_height")
    @ApiModelProperty(value = "")
    private String goodsHeight;

    @TableField(value = "load_station")
    @ApiModelProperty(value = "")
    private String loadStation;

    private static final long serialVersionUID = 501825634203102829L;

    public static final String COL_DRIVER_CODE = "driver_code";

    public static final String COL_ADD_CARRIAGE_TOTAL = "add_carriage_total";

    public static final String COL_ALLOW_CARRY_WEIGHT = "allow_carry_weight";

    public static final String COL_BACK_BILL_CODE = "back_bill_code";

    public static final String COL_BALANCE_TIME = "balance_time";

    public static final String COL_CAR_NO = "car_no";

    public static final String COL_CAR_TYPE = "car_type";

    public static final String COL_CAR_WIDTH = "car_width";

    public static final String COL_CARRY_FEE_TOTAL = "carry_fee_total";

    public static final String COL_DEAL_GOODS_STATION = "deal_goods_station";

    public static final String COL_FACT_CARRIAGE_TOTAL = "fact_carriage_total";

    public static final String COL_GOODS_HEIGHT = "goods_height";

    public static final String COL_LOAD_STATION = "load_station";
}
