package cn.hellomyheart.logistics.management.system.entity;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Sentlist")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sentlist")
public class Sentlist implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "back_cost")
    @ApiModelProperty(value = "")
    private Double backCost;

    @TableField(value = "car_card_no")
    @ApiModelProperty(value = "")
    private String carCardNo;

    @TableField(value = "cash_pay")
    @ApiModelProperty(value = "")
    private Double cashPay;

    @TableField(value = "driver_name")
    @ApiModelProperty(value = "")
    private String driverName;

    @TableField(value = "goods_code")
    @ApiModelProperty(value = "")
    private String goodsCode;

    @TableField(value = "goods_name")
    @ApiModelProperty(value = "")
    private String goodsName;

    @TableField(value = "goods_revert_bill_code")
    @ApiModelProperty(value = "")
    private String goodsRevertBillCode;

    @TableField(value = "help_accept_fund")
    @ApiModelProperty(value = "")
    private String helpAcceptFund;

    @TableField(value = "mobile")
    @ApiModelProperty(value = "")
    private String mobile;

    @TableField(value = "pickup_pay")
    @ApiModelProperty(value = "")
    private Double pickupPay;

    @TableField(value = "piece_amount")
    @ApiModelProperty(value = "")
    private Integer pieceAmount;

    @TableField(value = "remark")
    @ApiModelProperty(value = "")
    private String remark;

    @TableField(value = "send_goods_customer")
    @ApiModelProperty(value = "")
    private String sendGoodsCustomer;

    @TableField(value = "send_goods_customer_tel")
    @ApiModelProperty(value = "")
    private String sendGoodsCustomerTel;

    @TableField(value = "transfer_destination")
    @ApiModelProperty(value = "")
    private String transferDestination;

    @TableField(value = "user_id")
    @ApiModelProperty(value = "")
    private Integer userId;

    private static final long serialVersionUID = -2046451906731175633L;

    public static final String COL_ID = "id";

    public static final String COL_BACK_COST = "back_cost";

    public static final String COL_CAR_CARD_NO = "car_card_no";

    public static final String COL_CASH_PAY = "cash_pay";

    public static final String COL_DRIVER_NAME = "driver_name";

    public static final String COL_GOODS_CODE = "goods_code";

    public static final String COL_GOODS_NAME = "goods_name";

    public static final String COL_GOODS_REVERT_BILL_CODE = "goods_revert_bill_code";

    public static final String COL_HELP_ACCEPT_FUND = "help_accept_fund";

    public static final String COL_MOBILE = "mobile";

    public static final String COL_PICKUP_PAY = "pickup_pay";

    public static final String COL_PIECE_AMOUNT = "piece_amount";

    public static final String COL_REMARK = "remark";

    public static final String COL_SEND_GOODS_CUSTOMER = "send_goods_customer";

    public static final String COL_SEND_GOODS_CUSTOMER_TEL = "send_goods_customer_tel";

    public static final String COL_TRANSFER_DESTINATION = "transfer_destination";

    public static final String COL_USER_ID = "user_id";
}
