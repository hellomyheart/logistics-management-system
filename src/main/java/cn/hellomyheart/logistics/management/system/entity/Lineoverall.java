package cn.hellomyheart.logistics.management.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Lineoverall")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lineoverall implements Serializable {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private Double allCarriageTotal;

    @ApiModelProperty(value="")
    private String dealGoodsStation;

    @ApiModelProperty(value="")
    private Double insuranceTotal;

    @ApiModelProperty(value="")
    private String loadStation;

    @ApiModelProperty(value="")
    private Integer times;

    private static final long serialVersionUID = 1L;
}