package cn.hellomyheart.logistics.management.system.entity;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Transfercominfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "transfercominfo")
public class Transfercominfo implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "city")
    @ApiModelProperty(value = "")
    private String city;

    @TableField(value = "company_name")
    @ApiModelProperty(value = "")
    private String companyName;

    @TableField(value = "detail_address")
    @ApiModelProperty(value = "")
    private String detailAddress;

    @TableField(value = "link_phone")
    @ApiModelProperty(value = "")
    private String linkPhone;

    private static final long serialVersionUID = 3744081189949422674L;

    public static final String COL_ID = "id";

    public static final String COL_CITY = "city";

    public static final String COL_COMPANY_NAME = "company_name";

    public static final String COL_DETAIL_ADDRESS = "detail_address";

    public static final String COL_LINK_PHONE = "link_phone";
}
