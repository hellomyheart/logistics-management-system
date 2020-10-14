package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Customerreceiptinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customerreceiptinfo implements BaseEntity {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private Integer carryBillEventId;

    @ApiModelProperty(value="")
    private String checkGoodsRecord;

    @ApiModelProperty(value="")
    private String customer;

    @ApiModelProperty(value="")
    private String goodsBillCode;

    @ApiModelProperty(value="")
    private Date receiveGoodsDate;

    @ApiModelProperty(value="")
    private String receiveGoodsPerson;

    private static final long serialVersionUID = 5637655716878477719L;
}
