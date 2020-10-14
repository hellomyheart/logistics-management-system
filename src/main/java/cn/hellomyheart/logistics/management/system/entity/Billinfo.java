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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Billinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "billinfo")
public class Billinfo implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "accept_station")
    @ApiModelProperty(value = "")
    private String acceptStation;

    @TableField(value = "bill_code")
    @ApiModelProperty(value = "")
    private String billCode;

    @TableField(value = "bill_state")
    @ApiModelProperty(value = "")
    private String billState;

    @TableField(value = "bill_type")
    @ApiModelProperty(value = "")
    private String billType;

    @TableField(value = "write_date")
    @ApiModelProperty(value = "")
    private Date writeDate;

    private static final long serialVersionUID = 4791649025636335636L;

    public static final String COL_ID = "id";

    public static final String COL_ACCEPT_STATION = "accept_station";

    public static final String COL_BILL_CODE = "bill_code";

    public static final String COL_BILL_STATE = "bill_state";

    public static final String COL_BILL_TYPE = "bill_type";

    public static final String COL_WRITE_DATE = "write_date";
}
