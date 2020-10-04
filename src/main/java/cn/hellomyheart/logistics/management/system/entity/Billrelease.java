package cn.hellomyheart.logistics.management.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Billrelease")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Billrelease implements Serializable {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private String acceptStation;

    @ApiModelProperty(value="")
    private String billCode;

    @ApiModelProperty(value="")
    private String billType;

    @ApiModelProperty(value="")
    private String receiveBillPerson;

    @ApiModelProperty(value="")
    private Date receiveBillTime;

    @ApiModelProperty(value="")
    private String releasePerson;

    private static final long serialVersionUID = 1L;
}