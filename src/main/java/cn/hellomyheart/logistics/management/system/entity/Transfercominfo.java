package cn.hellomyheart.logistics.management.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Transfercominfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transfercominfo implements Serializable {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private String city;

    @ApiModelProperty(value="")
    private String companyName;

    @ApiModelProperty(value="")
    private String detailAddress;

    @ApiModelProperty(value="")
    private String linkPhone;

    private static final long serialVersionUID = 1L;
}