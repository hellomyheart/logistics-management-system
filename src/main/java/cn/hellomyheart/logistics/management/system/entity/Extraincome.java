package cn.hellomyheart.logistics.management.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Extraincome")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Extraincome implements Serializable {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private String incomeMonth;

    @ApiModelProperty(value="")
    private Double money;

    @ApiModelProperty(value="")
    private String name;

    @ApiModelProperty(value="")
    private Date writeDate;

    private static final long serialVersionUID = 1L;
}