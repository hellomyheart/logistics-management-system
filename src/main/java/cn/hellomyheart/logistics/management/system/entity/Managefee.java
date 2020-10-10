package cn.hellomyheart.logistics.management.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Managefee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Managefee implements Serializable {
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

    private static final long serialVersionUID = 1L;
}