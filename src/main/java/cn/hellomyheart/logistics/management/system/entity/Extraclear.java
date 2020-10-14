package cn.hellomyheart.logistics.management.system.entity;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Extraclear")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Extraclear implements BaseEntity {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private Date balanceDate;

    @ApiModelProperty(value="")
    private Double balanceMoney;

    @ApiModelProperty(value="")
    private String balanceType;

    @ApiModelProperty(value="")
    private String remark;

    @ApiModelProperty(value="")
    private String subjectName;

    private static final long serialVersionUID = -4032202901850563724L;
}
