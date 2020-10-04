package cn.hellomyheart.logistics.management.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Cityexpand")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cityexpand implements Serializable {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private Integer cityId;

    @ApiModelProperty(value="")
    private String rangeCity;

    private static final long serialVersionUID = 1L;
}