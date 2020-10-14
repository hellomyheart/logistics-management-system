package cn.hellomyheart.logistics.management.system.entity1;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "employee")
public class Employee implements BaseEntity {
    @TableId(value = "employee_code", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private String employeeCode;

    @TableField(value = "birthday")
    @ApiModelProperty(value = "")
    private Date birthday;

    @TableField(value = "department")
    @ApiModelProperty(value = "")
    private String department;

    @TableField(value = "employee_name")
    @ApiModelProperty(value = "")
    private String employeeName;

    @TableField(value = "gender")
    @ApiModelProperty(value = "")
    private String gender;

    @TableField(value = "position")
    @ApiModelProperty(value = "")
    private String position;

    private static final long serialVersionUID = -4777006249083394459L;

    public static final String COL_EMPLOYEE_CODE = "employee_code";

    public static final String COL_BIRTHDAY = "birthday";

    public static final String COL_DEPARTMENT = "department";

    public static final String COL_EMPLOYEE_NAME = "employee_name";

    public static final String COL_GENDER = "gender";

    public static final String COL_POSITION = "position";
}
