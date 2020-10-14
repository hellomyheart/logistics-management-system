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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Customeramount")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "customeramount")
public class Customeramount implements BaseEntity {
    @TableId(value = "send_goods_customer", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private String sendGoodsCustomer;

    @TableField(value = "carriage_total")
    @ApiModelProperty(value = "")
    private Double carriageTotal;

    @TableField(value = "insurance_total")
    @ApiModelProperty(value = "")
    private Double insuranceTotal;

    @TableField(value = "piece_amount_total")
    @ApiModelProperty(value = "")
    private Integer pieceAmountTotal;

    private static final long serialVersionUID = 8443691281911773678L;

    public static final String COL_SEND_GOODS_CUSTOMER = "send_goods_customer";

    public static final String COL_CARRIAGE_TOTAL = "carriage_total";

    public static final String COL_INSURANCE_TOTAL = "insurance_total";

    public static final String COL_PIECE_AMOUNT_TOTAL = "piece_amount_total";
}
