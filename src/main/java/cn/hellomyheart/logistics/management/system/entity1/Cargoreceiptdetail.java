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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Cargoreceiptdetail")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "cargoreceiptdetail")
public class Cargoreceiptdetail implements BaseEntity {
    @TableId(value = "goods_revert_bill_id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private String goodsRevertBillId;

    @TableField(value = "goods_bill_detail_id")
    @ApiModelProperty(value = "")
    private String goodsBillDetailId;

    @TableField(value = "goods_value")
    @ApiModelProperty(value = "")
    private Double goodsValue;

    @TableField(value = "piece_amount")
    @ApiModelProperty(value = "")
    private Integer pieceAmount;

    @TableField(value = "price_mode")
    @ApiModelProperty(value = "")
    private String priceMode;

    @TableField(value = "price_standard")
    @ApiModelProperty(value = "")
    private String priceStandard;

    @TableField(value = "volume")
    @ApiModelProperty(value = "")
    private Double volume;

    @TableField(value = "weight")
    @ApiModelProperty(value = "")
    private Double weight;

    private static final long serialVersionUID = 6236813685210361110L;

    public static final String COL_GOODS_REVERT_BILL_ID = "goods_revert_bill_id";

    public static final String COL_GOODS_BILL_DETAIL_ID = "goods_bill_detail_id";

    public static final String COL_GOODS_VALUE = "goods_value";

    public static final String COL_PIECE_AMOUNT = "piece_amount";

    public static final String COL_PRICE_MODE = "price_mode";

    public static final String COL_PRICE_STANDARD = "price_standard";

    public static final String COL_VOLUME = "volume";

    public static final String COL_WEIGHT = "weight";
}
