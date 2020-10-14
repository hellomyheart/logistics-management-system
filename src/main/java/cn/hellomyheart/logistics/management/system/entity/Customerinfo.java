package cn.hellomyheart.logistics.management.system.entity;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Customerinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customerinfo implements BaseEntity {
    @ApiModelProperty(value="")
    private String customerCode;

    @ApiModelProperty(value="")
    private String address;

    @ApiModelProperty(value="")
    private String customer;

    @ApiModelProperty(value="")
    private String customerType;

    @ApiModelProperty(value="")
    private String email;

    @ApiModelProperty(value="")
    private String enterpriseProperty;

    @ApiModelProperty(value="")
    private String enterpriseSize;

    @ApiModelProperty(value="")
    private String fax;

    @ApiModelProperty(value="")
    private String linkman;

    @ApiModelProperty(value="")
    private String linkmanMobile;

    @ApiModelProperty(value="")
    private String phone;

    @ApiModelProperty(value="")
    private String postCode;

    private static final long serialVersionUID = 8576541681705018265L;
}
