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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Cargoerror")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "cargoerror")
public class Cargoerror implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "customer")
    @ApiModelProperty(value = "")
    private String customer;

    @TableField(value = "goods_bill_code")
    @ApiModelProperty(value = "")
    private String goodsBillCode;

    @TableField(value = "goods_name")
    @ApiModelProperty(value = "")
    private String goodsName;

    @TableField(value = "goods_revert_bill_code")
    @ApiModelProperty(value = "")
    private String goodsRevertBillCode;

    @TableField(value = "goods_value")
    @ApiModelProperty(value = "")
    private Double goodsValue;

    @TableField(value = "mistake_type")
    @ApiModelProperty(value = "")
    private String mistakeType;

    @TableField(value = "piece_amount")
    @ApiModelProperty(value = "")
    private Integer pieceAmount;

    @TableField(value = "size")
    @ApiModelProperty(value = "")
    private String size;

    private static final long serialVersionUID = 3973371126966786619L;

    public static final String COL_ID = "id";

    public static final String COL_CUSTOMER = "customer";

    public static final String COL_GOODS_BILL_CODE = "goods_bill_code";

    public static final String COL_GOODS_NAME = "goods_name";

    public static final String COL_GOODS_REVERT_BILL_CODE = "goods_revert_bill_code";

    public static final String COL_GOODS_VALUE = "goods_value";

    public static final String COL_MISTAKE_TYPE = "mistake_type";

    public static final String COL_PIECE_AMOUNT = "piece_amount";

    public static final String COL_SIZE = "size";
}
