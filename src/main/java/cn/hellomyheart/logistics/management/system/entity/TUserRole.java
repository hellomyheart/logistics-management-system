package cn.hellomyheart.logistics.management.system.entity;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-TUserRole")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TUserRole implements BaseEntity {
    @ApiModelProperty(value="")
    private String userId;

    @ApiModelProperty(value="")
    private String roleId;

    @ApiModelProperty(value="")
    private Date createTime;

    @ApiModelProperty(value="")
    private String creator;

    private static final long serialVersionUID = -4698827903396606423L;
}
