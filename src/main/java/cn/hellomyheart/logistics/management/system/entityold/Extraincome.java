package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Extraincome")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Extraincome implements BaseEntity {
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

    private static final long serialVersionUID = -6014834092720729726L;
}
