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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Cityexpand")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "cityexpand")
public class Cityexpand implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "city_id")
    @ApiModelProperty(value = "")
    private Integer cityId;

    @TableField(value = "range_city")
    @ApiModelProperty(value = "")
    private String rangeCity;

    private static final long serialVersionUID = -4830857150585602936L;

    public static final String COL_ID = "id";

    public static final String COL_CITY_ID = "city_id";

    public static final String COL_RANGE_CITY = "range_city";
}
