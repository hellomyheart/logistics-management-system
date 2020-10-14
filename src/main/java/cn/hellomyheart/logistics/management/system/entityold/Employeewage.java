package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Employeewage")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employeewage implements BaseEntity {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private Double allowance;

    @ApiModelProperty(value="")
    private Double basicWage;

    @ApiModelProperty(value="")
    private Date date;

    @ApiModelProperty(value="")
    private String employee;

    @ApiModelProperty(value="")
    private String employeeCode;

    @ApiModelProperty(value="")
    private Double stationWage;

    private static final long serialVersionUID = 1551679230774490088L;
}
