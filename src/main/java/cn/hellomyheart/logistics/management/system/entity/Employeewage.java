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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Employeewage")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "employeewage")
public class Employeewage implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "allowance")
    @ApiModelProperty(value = "")
    private Double allowance;

    @TableField(value = "basic_wage")
    @ApiModelProperty(value = "")
    private Double basicWage;

    @TableField(value = "date")
    @ApiModelProperty(value = "")
    private Date date;

    @TableField(value = "employee")
    @ApiModelProperty(value = "")
    private String employee;

    @TableField(value = "employee_code")
    @ApiModelProperty(value = "")
    private String employeeCode;

    @TableField(value = "station_wage")
    @ApiModelProperty(value = "")
    private Double stationWage;

    private static final long serialVersionUID = -4085184889621834698L;

    public static final String COL_ID = "id";

    public static final String COL_ALLOWANCE = "allowance";

    public static final String COL_BASIC_WAGE = "basic_wage";

    public static final String COL_DATE = "date";

    public static final String COL_EMPLOYEE = "employee";

    public static final String COL_EMPLOYEE_CODE = "employee_code";

    public static final String COL_STATION_WAGE = "station_wage";
}
