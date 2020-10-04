package cn.hellomyheart.logistics.management.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-Callbackinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Callbackinfo implements Serializable {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private String billId;

    @ApiModelProperty(value="")
    private String billType;

    @ApiModelProperty(value="")
    private String content;

    @ApiModelProperty(value="")
    private String dialNo;

    @ApiModelProperty(value="")
    private Date finallyDialTime;

    @ApiModelProperty(value="")
    private String goodsBillId;

    @ApiModelProperty(value="")
    private Boolean locked;

    @ApiModelProperty(value="")
    private Boolean success;

    @ApiModelProperty(value="")
    private String type;

    @ApiModelProperty(value="")
    private Date writeTime;

    @ApiModelProperty(value="")
    private String writer;

    private static final long serialVersionUID = 1L;
}