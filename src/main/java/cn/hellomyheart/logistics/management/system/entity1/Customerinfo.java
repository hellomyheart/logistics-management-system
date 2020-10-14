package cn.hellomyheart.logistics.management.system.entity1;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Customerinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "customerinfo")
public class Customerinfo implements BaseEntity {
    @TableId(value = "customer_code", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private String customerCode;

    @TableField(value = "address")
    @ApiModelProperty(value = "")
    private String address;

    @TableField(value = "customer")
    @ApiModelProperty(value = "")
    private String customer;

    @TableField(value = "customer_type")
    @ApiModelProperty(value = "")
    private String customerType;

    @TableField(value = "email")
    @ApiModelProperty(value = "")
    private String email;

    @TableField(value = "enterprise_property")
    @ApiModelProperty(value = "")
    private String enterpriseProperty;

    @TableField(value = "enterprise_size")
    @ApiModelProperty(value = "")
    private String enterpriseSize;

    @TableField(value = "fax")
    @ApiModelProperty(value = "")
    private String fax;

    @TableField(value = "linkman")
    @ApiModelProperty(value = "")
    private String linkman;

    @TableField(value = "linkman_mobile")
    @ApiModelProperty(value = "")
    private String linkmanMobile;

    @TableField(value = "phone")
    @ApiModelProperty(value = "")
    private String phone;

    @TableField(value = "post_code")
    @ApiModelProperty(value = "")
    private String postCode;

    private static final long serialVersionUID = -8764243804294519837L;

    public static final String COL_CUSTOMER_CODE = "customer_code";

    public static final String COL_ADDRESS = "address";

    public static final String COL_CUSTOMER = "customer";

    public static final String COL_CUSTOMER_TYPE = "customer_type";

    public static final String COL_EMAIL = "email";

    public static final String COL_ENTERPRISE_PROPERTY = "enterprise_property";

    public static final String COL_ENTERPRISE_SIZE = "enterprise_size";

    public static final String COL_FAX = "fax";

    public static final String COL_LINKMAN = "linkman";

    public static final String COL_LINKMAN_MOBILE = "linkman_mobile";

    public static final String COL_PHONE = "phone";

    public static final String COL_POST_CODE = "post_code";
}
