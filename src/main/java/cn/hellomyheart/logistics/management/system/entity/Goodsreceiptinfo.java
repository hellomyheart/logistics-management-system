package cn.hellomyheart.logistics.management.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Goodsreceiptinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goodsreceiptinfo implements Serializable {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private String checkGoodsRecord;

    @ApiModelProperty(value="")
    private String driverName;

    @ApiModelProperty(value="")
    private String goodsRevertCode;

    @ApiModelProperty(value="")
    private Date rceiveGoodsDate;

    @ApiModelProperty(value="")
    private String receiveGoodsPerson;

    private static final long serialVersionUID = 1L;
}