package cn.hellomyheart.logistics.management.system.entity;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Billinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Billinfo implements BaseEntity {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private String acceptStation;

    @ApiModelProperty(value="")
    private String billCode;

    @ApiModelProperty(value="")
    private String billState;

    @ApiModelProperty(value="")
    private String billType;

    @ApiModelProperty(value="")
    private Date writeDate;

    private static final long serialVersionUID = 5960412969355946946L;
}
