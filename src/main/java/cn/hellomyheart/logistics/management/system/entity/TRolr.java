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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-TRolr")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_rolr")
public class TRolr implements BaseEntity {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private String id;

    @TableField(value = "role_name")
    @ApiModelProperty(value = "")
    private String roleName;

    @TableField(value = "description")
    @ApiModelProperty(value = "")
    private String description;

    @TableField(value = "create_time")
    @ApiModelProperty(value = "")
    private Date createTime;

    @TableField(value = "update_time")
    @ApiModelProperty(value = "")
    private Date updateTime;

    @TableField(value = "status")
    @ApiModelProperty(value = "")
    private String status;

    private static final long serialVersionUID = -8249911489249666521L;

    public static final String COL_ID = "id";

    public static final String COL_ROLE_NAME = "role_name";

    public static final String COL_DESCRIPTION = "description";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_STATUS = "status";
}
