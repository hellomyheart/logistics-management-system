package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Cargoerror")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cargoerror implements BaseEntity {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private String customer;

    @ApiModelProperty(value="")
    private String goodsBillCode;

    @ApiModelProperty(value="")
    private String goodsName;

    @ApiModelProperty(value="")
    private String goodsRevertBillCode;

    @ApiModelProperty(value="")
    private Double goodsValue;

    @ApiModelProperty(value="")
    private String mistakeType;

    @ApiModelProperty(value="")
    private Integer pieceAmount;

    @ApiModelProperty(value="")
    private String size;

    private static final long serialVersionUID = 5150061137940762115L;
}
