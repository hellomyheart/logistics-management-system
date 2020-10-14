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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Extraclear")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "extraclear")
public class Extraclear implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "balance_date")
    @ApiModelProperty(value = "")
    private Date balanceDate;

    @TableField(value = "balance_money")
    @ApiModelProperty(value = "")
    private Double balanceMoney;

    @TableField(value = "balance_type")
    @ApiModelProperty(value = "")
    private String balanceType;

    @TableField(value = "remark")
    @ApiModelProperty(value = "")
    private String remark;

    @TableField(value = "subject_name")
    @ApiModelProperty(value = "")
    private String subjectName;

    private static final long serialVersionUID = -92174463627180047L;

    public static final String COL_ID = "id";

    public static final String COL_BALANCE_DATE = "balance_date";

    public static final String COL_BALANCE_MONEY = "balance_money";

    public static final String COL_BALANCE_TYPE = "balance_type";

    public static final String COL_REMARK = "remark";

    public static final String COL_SUBJECT_NAME = "subject_name";
}
