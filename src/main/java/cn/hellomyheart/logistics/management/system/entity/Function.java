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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Function")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "function_")
public class Function implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "page_function")
    @ApiModelProperty(value = "")
    private String pageFunction;

    @TableField(value = "page_name")
    @ApiModelProperty(value = "")
    private String pageName;

    private static final long serialVersionUID = 9138723722080498631L;

    public static final String COL_ID = "id";

    public static final String COL_PAGE_FUNCTION = "page_function";

    public static final String COL_PAGE_NAME = "page_name";
}
