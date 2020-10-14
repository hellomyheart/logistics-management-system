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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Contactsservice")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "contactsservice")
public class Contactsservice implements BaseEntity {
    @TableId(value = "send_goods_customer", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private String sendGoodsCustomer;

    @TableField(value = "balance")
    @ApiModelProperty(value = "")
    private Double balance;

    @TableField(value = "bill_money")
    @ApiModelProperty(value = "")
    private Double billMoney;

    @TableField(value = "carriage")
    @ApiModelProperty(value = "")
    private Double carriage;

    @TableField(value = "goods_bill_code")
    @ApiModelProperty(value = "")
    private String goodsBillCode;

    @TableField(value = "insurance")
    @ApiModelProperty(value = "")
    private Double insurance;

    @TableField(value = "money_receivable")
    @ApiModelProperty(value = "")
    private Double moneyReceivable;

    @TableField(value = "receive_goods_addr")
    @ApiModelProperty(value = "")
    private String receiveGoodsAddr;

    @TableField(value = "received_money")
    @ApiModelProperty(value = "")
    private Double receivedMoney;

    @TableField(value = "send_goods_addr")
    @ApiModelProperty(value = "")
    private String sendGoodsAddr;

    @TableField(value = "send_goods_date")
    @ApiModelProperty(value = "")
    private Date sendGoodsDate;

    private static final long serialVersionUID = -4929555681302652298L;

    public static final String COL_SEND_GOODS_CUSTOMER = "send_goods_customer";

    public static final String COL_BALANCE = "balance";

    public static final String COL_BILL_MONEY = "bill_money";

    public static final String COL_CARRIAGE = "carriage";

    public static final String COL_GOODS_BILL_CODE = "goods_bill_code";

    public static final String COL_INSURANCE = "insurance";

    public static final String COL_MONEY_RECEIVABLE = "money_receivable";

    public static final String COL_RECEIVE_GOODS_ADDR = "receive_goods_addr";

    public static final String COL_RECEIVED_MONEY = "received_money";

    public static final String COL_SEND_GOODS_ADDR = "send_goods_addr";

    public static final String COL_SEND_GOODS_DATE = "send_goods_date";
}
