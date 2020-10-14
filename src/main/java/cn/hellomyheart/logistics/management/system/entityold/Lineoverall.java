package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Lineoverall")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lineoverall implements BaseEntity {
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

    private static final long serialVersionUID = 4932732536184371483L;
}
