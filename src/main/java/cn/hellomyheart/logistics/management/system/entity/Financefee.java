package cn.hellomyheart.logistics.management.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Financefee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Financefee implements Serializable {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private Double fee;

    @ApiModelProperty(value="")
    private String payoutMonth;

    @ApiModelProperty(value="")
    private Date writeDate;

    private static final long serialVersionUID = 1L;
}