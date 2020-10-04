package cn.hellomyheart.logistics.management.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Driverinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driverinfo implements Serializable {
    @ApiModelProperty(value="")
    private String id;

    @ApiModelProperty(value="")
    private String address;

    @ApiModelProperty(value="")
    private Double allowCarryVolume;

    @ApiModelProperty(value="")
    private Double allowCarryWeight;

    @ApiModelProperty(value="")
    private Date birthday;

    @ApiModelProperty(value="")
    private String bizLicence;

    @ApiModelProperty(value="")
    private String carDept;

    @ApiModelProperty(value="")
    private String carDeptTel;

    @ApiModelProperty(value="")
    private String carFrameNo;

    @ApiModelProperty(value="")
    private String carLength;

    @ApiModelProperty(value="")
    private String carNo;

    @ApiModelProperty(value="")
    private String carType;

    @ApiModelProperty(value="")
    private String carWidth;

    @ApiModelProperty(value="")
    private Boolean companyCar;

    @ApiModelProperty(value="")
    private String driveLicence;

    @ApiModelProperty(value="")
    private String driverName;

    @ApiModelProperty(value="")
    private String engineNo;

    @ApiModelProperty(value="")
    private String gender;

    @ApiModelProperty(value="")
    private String goodsHeight;

    @ApiModelProperty(value="")
    private String idCard;

    @ApiModelProperty(value="")
    private String insuranceCard;

    @ApiModelProperty(value="")
    private String phone;

    @ApiModelProperty(value="")
    private String remark;

    @ApiModelProperty(value="")
    private String runLicence;

    @ApiModelProperty(value="")
    private String state;

    private static final long serialVersionUID = 1L;
}