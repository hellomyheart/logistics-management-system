package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Proxyfeeclear")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Proxyfeeclear implements BaseEntity {
    @ApiModelProperty(value="")
    private String goodsBillCode;

    @ApiModelProperty(value="")
    private Double accountReceivable;

    @ApiModelProperty(value="")
    private Date balanceDate;

    @ApiModelProperty(value="")
    private Double commisionRate;

    @ApiModelProperty(value="")
    private Double commisionReceivable;

    @ApiModelProperty(value="")
    private String customerCode;

    @ApiModelProperty(value="")
    private Double factReceiveFund;

    @ApiModelProperty(value="")
    private Double goodsPayChange;

    @ApiModelProperty(value="")
    private Double receivedCommision;

    private static final long serialVersionUID = 6101018058830461681L;
}
