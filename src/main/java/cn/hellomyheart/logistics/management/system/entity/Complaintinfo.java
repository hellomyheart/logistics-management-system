package cn.hellomyheart.logistics.management.system.entity;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Complaintinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Complaintinfo implements BaseEntity {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private String appealContent;

    @ApiModelProperty(value="")
    private String appealDate;

    @ApiModelProperty(value="")
    private String callBackDate;

    @ApiModelProperty(value="")
    private String customer;

    @ApiModelProperty(value="")
    private String dealDate;

    @ApiModelProperty(value="")
    private String dealPerson;

    @ApiModelProperty(value="")
    private String dealResult;

    @ApiModelProperty(value="")
    private String goodsBillCode;

    @ApiModelProperty(value="")
    private Boolean ifCallback;

    @ApiModelProperty(value="")
    private Boolean ifHandle;

    private static final long serialVersionUID = 8374272242405951916L;
}
