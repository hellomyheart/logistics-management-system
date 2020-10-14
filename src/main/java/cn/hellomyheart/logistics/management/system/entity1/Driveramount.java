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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Driveramount")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "driveramount")
public class Driveramount implements BaseEntity {
    @TableId(value = "driver_code", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private String driverCode;

    @TableField(value = "add_carriage_total")
    @ApiModelProperty(value = "")
    private Double addCarriageTotal;

    @TableField(value = "carry_fee_total")
    @ApiModelProperty(value = "")
    private Double carryFeeTotal;

    @TableField(value = "total")
    @ApiModelProperty(value = "")
    private Double total;

    private static final long serialVersionUID = -1126980175593747250L;

    public static final String COL_DRIVER_CODE = "driver_code";

    public static final String COL_ADD_CARRIAGE_TOTAL = "add_carriage_total";

    public static final String COL_CARRY_FEE_TOTAL = "carry_fee_total";

    public static final String COL_TOTAL = "total";
}
