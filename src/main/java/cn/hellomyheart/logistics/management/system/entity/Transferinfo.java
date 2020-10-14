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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Transferinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "transferinfo")
public class Transferinfo implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "after_transfer_bill")
    @ApiModelProperty(value = "")
    private String afterTransferBill;

    @TableField(value = "check_time")
    @ApiModelProperty(value = "")
    private Date checkTime;

    @TableField(value = "description")
    @ApiModelProperty(value = "")
    private String description;

    @TableField(value = "goods_bill_code")
    @ApiModelProperty(value = "")
    private String goodsBillCode;

    @TableField(value = "transfer_addr")
    @ApiModelProperty(value = "")
    private String transferAddr;

    @TableField(value = "transfer_check")
    @ApiModelProperty(value = "")
    private String transferCheck;

    @TableField(value = "transfer_company")
    @ApiModelProperty(value = "")
    private String transferCompany;

    @TableField(value = "transfer_fee")
    @ApiModelProperty(value = "")
    private Double transferFee;

    @TableField(value = "transfer_station")
    @ApiModelProperty(value = "")
    private String transferStation;

    @TableField(value = "transfer_station_tel")
    @ApiModelProperty(value = "")
    private String transferStationTel;

    private static final long serialVersionUID = 3695046886896393558L;

    public static final String COL_ID = "id";

    public static final String COL_AFTER_TRANSFER_BILL = "after_transfer_bill";

    public static final String COL_CHECK_TIME = "check_time";

    public static final String COL_DESCRIPTION = "description";

    public static final String COL_GOODS_BILL_CODE = "goods_bill_code";

    public static final String COL_TRANSFER_ADDR = "transfer_addr";

    public static final String COL_TRANSFER_CHECK = "transfer_check";

    public static final String COL_TRANSFER_COMPANY = "transfer_company";

    public static final String COL_TRANSFER_FEE = "transfer_fee";

    public static final String COL_TRANSFER_STATION = "transfer_station";

    public static final String COL_TRANSFER_STATION_TEL = "transfer_station_tel";
}
