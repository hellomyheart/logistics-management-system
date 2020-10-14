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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Managefee")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "managefee")
public class Managefee implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "house_rent")
    @ApiModelProperty(value = "")
    private Double houseRent;

    @TableField(value = "office_fee")
    @ApiModelProperty(value = "")
    private Double officeFee;

    @TableField(value = "other_payout")
    @ApiModelProperty(value = "")
    private Double otherPayout;

    @TableField(value = "payout_month")
    @ApiModelProperty(value = "")
    private String payoutMonth;

    @TableField(value = "phone_fee")
    @ApiModelProperty(value = "")
    private Double phoneFee;

    @TableField(value = "water_elec_fee")
    @ApiModelProperty(value = "")
    private Double waterElecFee;

    @TableField(value = "write_date")
    @ApiModelProperty(value = "")
    private Date writeDate;

    private static final long serialVersionUID = -1110878705709681698L;

    public static final String COL_ID = "id";

    public static final String COL_HOUSE_RENT = "house_rent";

    public static final String COL_OFFICE_FEE = "office_fee";

    public static final String COL_OTHER_PAYOUT = "other_payout";

    public static final String COL_PAYOUT_MONTH = "payout_month";

    public static final String COL_PHONE_FEE = "phone_fee";

    public static final String COL_WATER_ELEC_FEE = "water_elec_fee";

    public static final String COL_WRITE_DATE = "write_date";
}
