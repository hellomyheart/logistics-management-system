package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Goodsbillevent")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goodsbillevent implements BaseEntity {
    @ApiModelProperty(value="")
    private String goodsBillId;

    @ApiModelProperty(value="")
    private String eventName;

    @ApiModelProperty(value="")
    private Date occurTime;

    @ApiModelProperty(value="")
    private String remark;

    private static final long serialVersionUID = -7372793092753826037L;
}
