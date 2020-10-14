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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Compensationinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "compensationinfo")
public class Compensationinfo implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "amends")
    @ApiModelProperty(value = "")
    private Double amends;

    @TableField(value = "amends_time")
    @ApiModelProperty(value = "")
    private Date amendsTime;

    @TableField(value = "bad_destroy_goods")
    @ApiModelProperty(value = "")
    private Double badDestroyGoods;

    @TableField(value = "customer")
    @ApiModelProperty(value = "")
    private String customer;

    @TableField(value = "receive_station_id")
    @ApiModelProperty(value = "")
    private Integer receiveStationId;

    @TableField(value = "receive_station_name")
    @ApiModelProperty(value = "")
    private String receiveStationName;

    @TableField(value = "remark")
    @ApiModelProperty(value = "")
    private String remark;

    @TableField(value = "write_date")
    @ApiModelProperty(value = "")
    private Date writeDate;

    private static final long serialVersionUID = 8142105900053961152L;

    public static final String COL_ID = "id";

    public static final String COL_AMENDS = "amends";

    public static final String COL_AMENDS_TIME = "amends_time";

    public static final String COL_BAD_DESTROY_GOODS = "bad_destroy_goods";

    public static final String COL_CUSTOMER = "customer";

    public static final String COL_RECEIVE_STATION_ID = "receive_station_id";

    public static final String COL_RECEIVE_STATION_NAME = "receive_station_name";

    public static final String COL_REMARK = "remark";

    public static final String COL_WRITE_DATE = "write_date";
}
