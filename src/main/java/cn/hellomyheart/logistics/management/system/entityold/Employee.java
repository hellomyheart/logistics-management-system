package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements BaseEntity {
    @ApiModelProperty(value="")
    private String employeeCode;

    @ApiModelProperty(value="")
    private Date birthday;

    @ApiModelProperty(value="")
    private String department;

    @ApiModelProperty(value="")
    private String employeeName;

    @ApiModelProperty(value="")
    private String gender;

    @ApiModelProperty(value="")
    private String position;

    private static final long serialVersionUID = -8519049758229835522L;
}
