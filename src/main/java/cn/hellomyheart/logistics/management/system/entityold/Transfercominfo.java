package cn.hellomyheart.logistics.management.system.entityold;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Transfercominfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transfercominfo implements BaseEntity {
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

    private static final long serialVersionUID = -3053540352208714357L;
}
