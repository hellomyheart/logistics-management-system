package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Managefee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Managefee implements BaseEntity {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private Double houseRent;

    @ApiModelProperty(value="")
    private Double officeFee;

    @ApiModelProperty(value="")
    private Double otherPayout;

    @ApiModelProperty(value="")
    private String payoutMonth;

    @ApiModelProperty(value="")
    private Double phoneFee;

    @ApiModelProperty(value="")
    private Double waterElecFee;

    @ApiModelProperty(value="")
    private Date writeDate;

    private static final long serialVersionUID = -5102670535336954208L;
}
