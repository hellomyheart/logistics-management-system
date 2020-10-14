package cn.hellomyheart.logistics.management.system.entity;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Compensationinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Compensationinfo implements BaseEntity {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private Double amends;

    @ApiModelProperty(value="")
    private Date amendsTime;

    @ApiModelProperty(value="")
    private Double badDestroyGoods;

    @ApiModelProperty(value="")
    private String customer;

    @ApiModelProperty(value="")
    private Integer receiveStationId;

    @ApiModelProperty(value="")
    private String receiveStationName;

    @ApiModelProperty(value="")
    private String remark;

    @ApiModelProperty(value="")
    private Date writeDate;

    private static final long serialVersionUID = 6007244614813677733L;
}
