package cn.hellomyheart.logistics.management.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Functionwithgroup")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Functionwithgroup implements Serializable {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private Integer functionId;

    @ApiModelProperty(value="")
    private Integer groupId;

    private static final long serialVersionUID = 1L;
}