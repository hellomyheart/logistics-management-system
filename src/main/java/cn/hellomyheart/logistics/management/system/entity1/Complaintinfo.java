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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Complaintinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "complaintinfo")
public class Complaintinfo implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "appeal_content")
    @ApiModelProperty(value = "")
    private String appealContent;

    @TableField(value = "appeal_date")
    @ApiModelProperty(value = "")
    private String appealDate;

    @TableField(value = "call_back_date")
    @ApiModelProperty(value = "")
    private String callBackDate;

    @TableField(value = "customer")
    @ApiModelProperty(value = "")
    private String customer;

    @TableField(value = "deal_date")
    @ApiModelProperty(value = "")
    private String dealDate;

    @TableField(value = "deal_person")
    @ApiModelProperty(value = "")
    private String dealPerson;

    @TableField(value = "deal_result")
    @ApiModelProperty(value = "")
    private String dealResult;

    @TableField(value = "goods_bill_code")
    @ApiModelProperty(value = "")
    private String goodsBillCode;

    @TableField(value = "if_callback")
    @ApiModelProperty(value = "")
    private Boolean ifCallback;

    @TableField(value = "if_handle")
    @ApiModelProperty(value = "")
    private Boolean ifHandle;

    private static final long serialVersionUID = 5092833313309961918L;

    public static final String COL_ID = "id";

    public static final String COL_APPEAL_CONTENT = "appeal_content";

    public static final String COL_APPEAL_DATE = "appeal_date";

    public static final String COL_CALL_BACK_DATE = "call_back_date";

    public static final String COL_CUSTOMER = "customer";

    public static final String COL_DEAL_DATE = "deal_date";

    public static final String COL_DEAL_PERSON = "deal_person";

    public static final String COL_DEAL_RESULT = "deal_result";

    public static final String COL_GOODS_BILL_CODE = "goods_bill_code";

    public static final String COL_IF_CALLBACK = "if_callback";

    public static final String COL_IF_HANDLE = "if_handle";
}
