package cn.hellomyheart.logistics.management.system.entity1;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Callbackinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "callbackinfo")
public class Callbackinfo implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "bill_id")
    @ApiModelProperty(value = "")
    private String billId;

    @TableField(value = "bill_type")
    @ApiModelProperty(value = "")
    private String billType;

    @TableField(value = "content")
    @ApiModelProperty(value = "")
    private String content;

    @TableField(value = "dial_no")
    @ApiModelProperty(value = "")
    private String dialNo;

    @TableField(value = "finally_dial_time")
    @ApiModelProperty(value = "")
    private Date finallyDialTime;

    @TableField(value = "goods_bill_id")
    @ApiModelProperty(value = "")
    private String goodsBillId;

    @TableField(value = "locked")
    @ApiModelProperty(value = "")
    private Boolean locked;

    @TableField(value = "success")
    @ApiModelProperty(value = "")
    private Boolean success;

    @TableField(value = "type")
    @ApiModelProperty(value = "")
    private String type;

    @TableField(value = "write_time")
    @ApiModelProperty(value = "")
    private Date writeTime;

    @TableField(value = "writer")
    @ApiModelProperty(value = "")
    private String writer;

    private static final long serialVersionUID = 7710879639636067550L;

    public static final String COL_ID = "id";

    public static final String COL_BILL_ID = "bill_id";

    public static final String COL_BILL_TYPE = "bill_type";

    public static final String COL_CONTENT = "content";

    public static final String COL_DIAL_NO = "dial_no";

    public static final String COL_FINALLY_DIAL_TIME = "finally_dial_time";

    public static final String COL_GOODS_BILL_ID = "goods_bill_id";

    public static final String COL_LOCKED = "locked";

    public static final String COL_SUCCESS = "success";

    public static final String COL_TYPE = "type";

    public static final String COL_WRITE_TIME = "write_time";

    public static final String COL_WRITER = "writer";
}
