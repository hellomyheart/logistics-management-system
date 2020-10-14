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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Proxyfeeclear")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "proxyfeeclear")
public class Proxyfeeclear implements BaseEntity {
    @TableId(value = "goods_bill_code", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private String goodsBillCode;

    @TableField(value = "account_receivable")
    @ApiModelProperty(value = "")
    private Double accountReceivable;

    @TableField(value = "balance_date")
    @ApiModelProperty(value = "")
    private Date balanceDate;

    @TableField(value = "commision_rate")
    @ApiModelProperty(value = "")
    private Double commisionRate;

    @TableField(value = "commision_receivable")
    @ApiModelProperty(value = "")
    private Double commisionReceivable;

    @TableField(value = "customer_code")
    @ApiModelProperty(value = "")
    private String customerCode;

    @TableField(value = "fact_receive_fund")
    @ApiModelProperty(value = "")
    private Double factReceiveFund;

    @TableField(value = "goods_pay_change")
    @ApiModelProperty(value = "")
    private Double goodsPayChange;

    @TableField(value = "received_commision")
    @ApiModelProperty(value = "")
    private Double receivedCommision;

    private static final long serialVersionUID = 6053821871380092652L;

    public static final String COL_GOODS_BILL_CODE = "goods_bill_code";

    public static final String COL_ACCOUNT_RECEIVABLE = "account_receivable";

    public static final String COL_BALANCE_DATE = "balance_date";

    public static final String COL_COMMISION_RATE = "commision_rate";

    public static final String COL_COMMISION_RECEIVABLE = "commision_receivable";

    public static final String COL_CUSTOMER_CODE = "customer_code";

    public static final String COL_FACT_RECEIVE_FUND = "fact_receive_fund";

    public static final String COL_GOODS_PAY_CHANGE = "goods_pay_change";

    public static final String COL_RECEIVED_COMMISION = "received_commision";
}
