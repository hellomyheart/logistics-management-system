package cn.hellomyheart.logistics.management.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Employeewage")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employeewage implements Serializable {
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

    private static final long serialVersionUID = 1L;
}