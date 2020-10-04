package cn.hellomyheart.logistics.management.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Userwithgroup")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Userwithgroup implements Serializable {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private Integer groupId;

    @ApiModelProperty(value="")
    private String userId;

    private static final long serialVersionUID = 1L;
}