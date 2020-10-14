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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Routeinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "routeinfo")
public class Routeinfo implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "distance")
    @ApiModelProperty(value = "")
    private Double distance;

    @TableField(value = "end_station")
    @ApiModelProperty(value = "")
    private Integer endStation;

    @TableField(value = "fetch_time")
    @ApiModelProperty(value = "")
    private Double fetchTime;

    @TableField(value = "pass_station")
    @ApiModelProperty(value = "")
    private String passStation;

    @TableField(value = "start_station")
    @ApiModelProperty(value = "")
    private Integer startStation;

    private static final long serialVersionUID = 9177883310750676759L;

    public static final String COL_ID = "id";

    public static final String COL_DISTANCE = "distance";

    public static final String COL_END_STATION = "end_station";

    public static final String COL_FETCH_TIME = "fetch_time";

    public static final String COL_PASS_STATION = "pass_station";

    public static final String COL_START_STATION = "start_station";
}
