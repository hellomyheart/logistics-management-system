package cn.hellomyheart.logistics.management.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-hellomyheart-logistics-management-system-entity-TPermission")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPermission implements Serializable {
    @ApiModelProperty(value="")
    private String id;

    /**
    * 权限标识符
    */
    @ApiModelProperty(value="权限标识符")
    private String code;

    /**
    * 描述
    */
    @ApiModelProperty(value="描述")
    private String description;

    /**
    * 请求地址
    */
    @ApiModelProperty(value="请求地址")
    private String url;

    private static final long serialVersionUID = 1L;
}