package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Cargoreceiptdetail")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cargoreceiptdetail implements BaseEntity {
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

    private static final long serialVersionUID = 7195454579194086275L;
}
