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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Userwithgroup")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "userwithgroup")
public class Userwithgroup implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "group_id")
    @ApiModelProperty(value = "")
    private Integer groupId;

    @TableField(value = "user_id")
    @ApiModelProperty(value = "")
    private String userId;

    private static final long serialVersionUID = -5709990414163577317L;

    public static final String COL_ID = "id";

    public static final String COL_GROUP_ID = "group_id";

    public static final String COL_USER_ID = "user_id";
}
