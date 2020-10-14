package cn.hellomyheart.logistics.management.system.entity;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Transferinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transferinfo implements BaseEntity {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private String afterTransferBill;

    @ApiModelProperty(value="")
    private Date checkTime;

    @ApiModelProperty(value="")
    private String description;

    @ApiModelProperty(value="")
    private String goodsBillCode;

    @ApiModelProperty(value="")
    private String transferAddr;

    @ApiModelProperty(value="")
    private String transferCheck;

    @ApiModelProperty(value="")
    private String transferCompany;

    @ApiModelProperty(value="")
    private Double transferFee;

    @ApiModelProperty(value="")
    private String transferStation;

    @ApiModelProperty(value="")
    private String transferStationTel;

    private static final long serialVersionUID = 730400584126758196L;
}
