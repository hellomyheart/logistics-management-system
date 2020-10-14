package cn.hellomyheart.logistics.management.system.entity;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-TRolr")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TRolr implements BaseEntity {
    @ApiModelProperty(value="")
    private String id;

    @ApiModelProperty(value="")
    private String roleName;

    @ApiModelProperty(value="")
    private String description;

    @ApiModelProperty(value="")
    private Date createTime;

    @ApiModelProperty(value="")
    private Date updateTime;

    @ApiModelProperty(value="")
    private String status;

    private static final long serialVersionUID = -8076051355608921572L;
}
