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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Cargoreceipt")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "cargoreceipt")
public class Cargoreceipt implements BaseEntity {
    @TableId(value = "goods_revert_bill_code", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private String goodsRevertBillCode;

    @TableField(value = "accept_station")
    @ApiModelProperty(value = "")
    private String acceptStation;

    @TableField(value = "all_carriage")
    @ApiModelProperty(value = "")
    private Double allCarriage;

    @TableField(value = "arrive_time")
    @ApiModelProperty(value = "")
    private Date arriveTime;

    @TableField(value = "back_bill_state")
    @ApiModelProperty(value = "")
    private String backBillState;

    @TableField(value = "carriage_banlance_mode")
    @ApiModelProperty(value = "")
    private String carriageBanlanceMode;

    @TableField(value = "carriage_mode")
    @ApiModelProperty(value = "")
    private String carriageMode;

    @TableField(value = "carry_goods_bill_deposit")
    @ApiModelProperty(value = "")
    private Double carryGoodsBillDeposit;

    @TableField(value = "carry_goods_insurance")
    @ApiModelProperty(value = "")
    private Double carryGoodsInsurance;

    @TableField(value = "deal_goods_station")
    @ApiModelProperty(value = "")
    private String dealGoodsStation;

    @TableField(value = "dispatch_service_fee")
    @ApiModelProperty(value = "")
    private Double dispatchServiceFee;

    @TableField(value = "driver_id")
    @ApiModelProperty(value = "")
    private String driverId;

    @TableField(value = "if_balance")
    @ApiModelProperty(value = "")
    private String ifBalance;

    @TableField(value = "insurance")
    @ApiModelProperty(value = "")
    private Double insurance;

    @TableField(value = "linkman_phone")
    @ApiModelProperty(value = "")
    private String linkmanPhone;

    @TableField(value = "load_station")
    @ApiModelProperty(value = "")
    private String loadStation;

    @TableField(value = "receive_goods_detail_addr")
    @ApiModelProperty(value = "")
    private String receiveGoodsDetailAddr;

    @TableField(value = "receive_goods_linkman")
    @ApiModelProperty(value = "")
    private String receiveGoodsLinkman;

    @TableField(value = "remark")
    @ApiModelProperty(value = "")
    private String remark;

    @TableField(value = "sign_time")
    @ApiModelProperty(value = "")
    private Date signTime;

    @TableField(value = "start_advance")
    @ApiModelProperty(value = "")
    private Double startAdvance;

    @TableField(value = "start_carry_time")
    @ApiModelProperty(value = "")
    private Date startCarryTime;

    private static final long serialVersionUID = 1430982568549838607L;

    public static final String COL_GOODS_REVERT_BILL_CODE = "goods_revert_bill_code";

    public static final String COL_ACCEPT_STATION = "accept_station";

    public static final String COL_ALL_CARRIAGE = "all_carriage";

    public static final String COL_ARRIVE_TIME = "arrive_time";

    public static final String COL_BACK_BILL_STATE = "back_bill_state";

    public static final String COL_CARRIAGE_BANLANCE_MODE = "carriage_banlance_mode";

    public static final String COL_CARRIAGE_MODE = "carriage_mode";

    public static final String COL_CARRY_GOODS_BILL_DEPOSIT = "carry_goods_bill_deposit";

    public static final String COL_CARRY_GOODS_INSURANCE = "carry_goods_insurance";

    public static final String COL_DEAL_GOODS_STATION = "deal_goods_station";

    public static final String COL_DISPATCH_SERVICE_FEE = "dispatch_service_fee";

    public static final String COL_DRIVER_ID = "driver_id";

    public static final String COL_IF_BALANCE = "if_balance";

    public static final String COL_INSURANCE = "insurance";

    public static final String COL_LINKMAN_PHONE = "linkman_phone";

    public static final String COL_LOAD_STATION = "load_station";

    public static final String COL_RECEIVE_GOODS_DETAIL_ADDR = "receive_goods_detail_addr";

    public static final String COL_RECEIVE_GOODS_LINKMAN = "receive_goods_linkman";

    public static final String COL_REMARK = "remark";

    public static final String COL_SIGN_TIME = "sign_time";

    public static final String COL_START_ADVANCE = "start_advance";

    public static final String COL_START_CARRY_TIME = "start_carry_time";
}
