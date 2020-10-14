package cn.hellomyheart.logistics.management.system.entity;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Billrelease")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "billrelease")
public class Billrelease implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "accept_station")
    @ApiModelProperty(value = "")
    private String acceptStation;

    @TableField(value = "bill_code")
    @ApiModelProperty(value = "")
    private String billCode;

    @TableField(value = "bill_type")
    @ApiModelProperty(value = "")
    private String billType;

    @TableField(value = "receive_bill_person")
    @ApiModelProperty(value = "")
    private String receiveBillPerson;

    @TableField(value = "receive_bill_time")
    @ApiModelProperty(value = "")
    private Date receiveBillTime;

    @TableField(value = "release_person")
    @ApiModelProperty(value = "")
    private String releasePerson;

    private static final long serialVersionUID = 9205702034315537763L;

    public static final String COL_ID = "id";

    public static final String COL_ACCEPT_STATION = "accept_station";

    public static final String COL_BILL_CODE = "bill_code";

    public static final String COL_BILL_TYPE = "bill_type";

    public static final String COL_RECEIVE_BILL_PERSON = "receive_bill_person";

    public static final String COL_RECEIVE_BILL_TIME = "receive_bill_time";

    public static final String COL_RELEASE_PERSON = "release_person";
}
