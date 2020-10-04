package cn.hellomyheart.logistics.management.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Cargoerror")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cargoerror implements Serializable {
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

    private static final long serialVersionUID = 1L;
}