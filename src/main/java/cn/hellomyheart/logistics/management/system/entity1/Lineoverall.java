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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Lineoverall")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "lineoverall")
public class Lineoverall implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "all_carriage_total")
    @ApiModelProperty(value = "")
    private Double allCarriageTotal;

    @TableField(value = "deal_goods_station")
    @ApiModelProperty(value = "")
    private String dealGoodsStation;

    @TableField(value = "insurance_total")
    @ApiModelProperty(value = "")
    private Double insuranceTotal;

    @TableField(value = "load_station")
    @ApiModelProperty(value = "")
    private String loadStation;

    @TableField(value = "times")
    @ApiModelProperty(value = "")
    private Integer times;

    private static final long serialVersionUID = -196582519396993015L;

    public static final String COL_ID = "id";

    public static final String COL_ALL_CARRIAGE_TOTAL = "all_carriage_total";

    public static final String COL_DEAL_GOODS_STATION = "deal_goods_station";

    public static final String COL_INSURANCE_TOTAL = "insurance_total";

    public static final String COL_LOAD_STATION = "load_station";

    public static final String COL_TIMES = "times";
}
