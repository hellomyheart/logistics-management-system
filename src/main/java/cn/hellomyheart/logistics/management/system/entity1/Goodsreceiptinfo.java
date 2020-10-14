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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Goodsreceiptinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "goodsreceiptinfo")
public class Goodsreceiptinfo implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "check_goods_record")
    @ApiModelProperty(value = "")
    private String checkGoodsRecord;

    @TableField(value = "driver_name")
    @ApiModelProperty(value = "")
    private String driverName;

    @TableField(value = "goods_revert_code")
    @ApiModelProperty(value = "")
    private String goodsRevertCode;

    @TableField(value = "rceive_goods_date")
    @ApiModelProperty(value = "")
    private Date rceiveGoodsDate;

    @TableField(value = "receive_goods_person")
    @ApiModelProperty(value = "")
    private String receiveGoodsPerson;

    private static final long serialVersionUID = -8093220516840402802L;

    public static final String COL_ID = "id";

    public static final String COL_CHECK_GOODS_RECORD = "check_goods_record";

    public static final String COL_DRIVER_NAME = "driver_name";

    public static final String COL_GOODS_REVERT_CODE = "goods_revert_code";

    public static final String COL_RCEIVE_GOODS_DATE = "rceive_goods_date";

    public static final String COL_RECEIVE_GOODS_PERSON = "receive_goods_person";
}
