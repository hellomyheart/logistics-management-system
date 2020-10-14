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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Goodsbillevent")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "goodsbillevent")
public class Goodsbillevent implements BaseEntity {
    @TableId(value = "goods_bill_id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private String goodsBillId;

    @TableField(value = "event_name")
    @ApiModelProperty(value = "")
    private String eventName;

    @TableField(value = "occur_time")
    @ApiModelProperty(value = "")
    private Date occurTime;

    @TableField(value = "remark")
    @ApiModelProperty(value = "")
    private String remark;

    private static final long serialVersionUID = 9188206379470511914L;

    public static final String COL_GOODS_BILL_ID = "goods_bill_id";

    public static final String COL_EVENT_NAME = "event_name";

    public static final String COL_OCCUR_TIME = "occur_time";

    public static final String COL_REMARK = "remark";
}
