package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Billrelease")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Billrelease implements BaseEntity {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private String acceptStation;

    @ApiModelProperty(value="")
    private String billCode;

    @ApiModelProperty(value="")
    private String billType;

    @ApiModelProperty(value="")
    private String receiveBillPerson;

    @ApiModelProperty(value="")
    private Date receiveBillTime;

    @ApiModelProperty(value="")
    private String releasePerson;

    private static final long serialVersionUID = 803959226673763758L;
}
