package cn.hellomyheart.logistics.management.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Cargoreceiptdetail")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cargoreceiptdetail implements Serializable {
    @ApiModelProperty(value="")
    private String goodsRevertBillId;

    @ApiModelProperty(value="")
    private String goodsBillDetailId;

    @ApiModelProperty(value="")
    private Double goodsValue;

    @ApiModelProperty(value="")
    private Integer pieceAmount;

    @ApiModelProperty(value="")
    private String priceMode;

    @ApiModelProperty(value="")
    private String priceStandard;

    @ApiModelProperty(value="")
    private Double volume;

    @ApiModelProperty(value="")
    private Double weight;

    private static final long serialVersionUID = 1L;
}