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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-TPermission")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_permission")
public class TPermission implements BaseEntity {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private String id;

    /**
     * 权限标识符
     */
    @TableField(value = "code")
    @ApiModelProperty(value = "权限标识符")
    private String code;

    /**
     * 描述
     */
    @TableField(value = "description")
    @ApiModelProperty(value = "描述")
    private String description;

    /**
     * 请求地址
     */
    @TableField(value = "url")
    @ApiModelProperty(value = "请求地址")
    private String url;

    private static final long serialVersionUID = 3607106984379046545L;

    public static final String COL_ID = "id";

    public static final String COL_CODE = "code";

    public static final String COL_DESCRIPTION = "description";

    public static final String COL_URL = "url";
}
