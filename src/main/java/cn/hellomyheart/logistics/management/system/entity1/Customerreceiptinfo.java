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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Customerreceiptinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "customerreceiptinfo")
public class Customerreceiptinfo implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "carry_bill_event_id")
    @ApiModelProperty(value = "")
    private Integer carryBillEventId;

    @TableField(value = "check_goods_record")
    @ApiModelProperty(value = "")
    private String checkGoodsRecord;

    @TableField(value = "customer")
    @ApiModelProperty(value = "")
    private String customer;

    @TableField(value = "goods_bill_code")
    @ApiModelProperty(value = "")
    private String goodsBillCode;

    @TableField(value = "receive_goods_date")
    @ApiModelProperty(value = "")
    private Date receiveGoodsDate;

    @TableField(value = "receive_goods_person")
    @ApiModelProperty(value = "")
    private String receiveGoodsPerson;

    private static final long serialVersionUID = -508691521864154985L;

    public static final String COL_ID = "id";

    public static final String COL_CARRY_BILL_EVENT_ID = "carry_bill_event_id";

    public static final String COL_CHECK_GOODS_RECORD = "check_goods_record";

    public static final String COL_CUSTOMER = "customer";

    public static final String COL_GOODS_BILL_CODE = "goods_bill_code";

    public static final String COL_RECEIVE_GOODS_DATE = "receive_goods_date";

    public static final String COL_RECEIVE_GOODS_PERSON = "receive_goods_person";
}
