package cn.hellomyheart.logistics.management.system.entity1;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Financefee")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "financefee")
public class Financefee implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "fee")
    @ApiModelProperty(value = "")
    private Double fee;

    @TableField(value = "payout_month")
    @ApiModelProperty(value = "")
    private String payoutMonth;

    @TableField(value = "write_date")
    @ApiModelProperty(value = "")
    private Date writeDate;

    private static final long serialVersionUID = 5975481591678710301L;

    public static final String COL_ID = "id";

    public static final String COL_FEE = "fee";

    public static final String COL_PAYOUT_MONTH = "payout_month";

    public static final String COL_WRITE_DATE = "write_date";
}
