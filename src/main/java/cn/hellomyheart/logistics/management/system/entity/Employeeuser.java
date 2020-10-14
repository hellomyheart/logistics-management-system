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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Employeeuser")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "employeeuser")
public class Employeeuser implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "employee_id")
    @ApiModelProperty(value = "")
    private Integer employeeId;

    @TableField(value = "user_id")
    @ApiModelProperty(value = "")
    private Integer userId;

    private static final long serialVersionUID = -2072547107304920779L;

    public static final String COL_ID = "id";

    public static final String COL_EMPLOYEE_ID = "employee_id";

    public static final String COL_USER_ID = "user_id";
}
