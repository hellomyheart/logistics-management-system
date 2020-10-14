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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Functionwithgroup")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "functionwithgroup")
public class Functionwithgroup implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "function_id")
    @ApiModelProperty(value = "")
    private Integer functionId;

    @TableField(value = "group_id")
    @ApiModelProperty(value = "")
    private Integer groupId;

    private static final long serialVersionUID = 7114768327309206478L;

    public static final String COL_ID = "id";

    public static final String COL_FUNCTION_ID = "function_id";

    public static final String COL_GROUP_ID = "group_id";
}
