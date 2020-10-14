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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Extraincome")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "extraincome")
public class Extraincome implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "income_month")
    @ApiModelProperty(value = "")
    private String incomeMonth;

    @TableField(value = "money")
    @ApiModelProperty(value = "")
    private Double money;

    @TableField(value = "name")
    @ApiModelProperty(value = "")
    private String name;

    @TableField(value = "write_date")
    @ApiModelProperty(value = "")
    private Date writeDate;

    private static final long serialVersionUID = -3888838133559981588L;

    public static final String COL_ID = "id";

    public static final String COL_INCOME_MONTH = "income_month";

    public static final String COL_MONEY = "money";

    public static final String COL_NAME = "name";

    public static final String COL_WRITE_DATE = "write_date";
}
