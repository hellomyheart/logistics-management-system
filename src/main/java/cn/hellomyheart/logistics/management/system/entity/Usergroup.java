package cn.hellomyheart.logistics.management.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Usergroup")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usergroup implements Serializable {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private String description;

    @ApiModelProperty(value="")
    private String groupName;

    private static final long serialVersionUID = 1L;
}