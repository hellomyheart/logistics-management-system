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

@ApiModel(value = "cn-hellomyheart-logistics-management-system-entity1-Driverinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "driverinfo")
public class Driverinfo implements BaseEntity {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private String id;

    @TableField(value = "address")
    @ApiModelProperty(value = "")
    private String address;

    @TableField(value = "allow_carry_volume")
    @ApiModelProperty(value = "")
    private Double allowCarryVolume;

    @TableField(value = "allow_carry_weight")
    @ApiModelProperty(value = "")
    private Double allowCarryWeight;

    @TableField(value = "birthday")
    @ApiModelProperty(value = "")
    private Date birthday;

    @TableField(value = "biz_licence")
    @ApiModelProperty(value = "")
    private String bizLicence;

    @TableField(value = "car_dept")
    @ApiModelProperty(value = "")
    private String carDept;

    @TableField(value = "car_dept_tel")
    @ApiModelProperty(value = "")
    private String carDeptTel;

    @TableField(value = "car_frame_no")
    @ApiModelProperty(value = "")
    private String carFrameNo;

    @TableField(value = "car_length")
    @ApiModelProperty(value = "")
    private String carLength;

    @TableField(value = "car_no")
    @ApiModelProperty(value = "")
    private String carNo;

    @TableField(value = "car_type")
    @ApiModelProperty(value = "")
    private String carType;

    @TableField(value = "car_width")
    @ApiModelProperty(value = "")
    private String carWidth;

    @TableField(value = "company_car")
    @ApiModelProperty(value = "")
    private Boolean companyCar;

    @TableField(value = "drive_licence")
    @ApiModelProperty(value = "")
    private String driveLicence;

    @TableField(value = "driver_name")
    @ApiModelProperty(value = "")
    private String driverName;

    @TableField(value = "engine_no")
    @ApiModelProperty(value = "")
    private String engineNo;

    @TableField(value = "gender")
    @ApiModelProperty(value = "")
    private String gender;

    @TableField(value = "goods_height")
    @ApiModelProperty(value = "")
    private String goodsHeight;

    @TableField(value = "id_card")
    @ApiModelProperty(value = "")
    private String idCard;

    @TableField(value = "insurance_card")
    @ApiModelProperty(value = "")
    private String insuranceCard;

    @TableField(value = "phone")
    @ApiModelProperty(value = "")
    private String phone;

    @TableField(value = "remark")
    @ApiModelProperty(value = "")
    private String remark;

    @TableField(value = "run_licence")
    @ApiModelProperty(value = "")
    private String runLicence;

    @TableField(value = "state")
    @ApiModelProperty(value = "")
    private String state;

    private static final long serialVersionUID = 4032940254637108547L;

    public static final String COL_ID = "id";

    public static final String COL_ADDRESS = "address";

    public static final String COL_ALLOW_CARRY_VOLUME = "allow_carry_volume";

    public static final String COL_ALLOW_CARRY_WEIGHT = "allow_carry_weight";

    public static final String COL_BIRTHDAY = "birthday";

    public static final String COL_BIZ_LICENCE = "biz_licence";

    public static final String COL_CAR_DEPT = "car_dept";

    public static final String COL_CAR_DEPT_TEL = "car_dept_tel";

    public static final String COL_CAR_FRAME_NO = "car_frame_no";

    public static final String COL_CAR_LENGTH = "car_length";

    public static final String COL_CAR_NO = "car_no";

    public static final String COL_CAR_TYPE = "car_type";

    public static final String COL_CAR_WIDTH = "car_width";

    public static final String COL_COMPANY_CAR = "company_car";

    public static final String COL_DRIVE_LICENCE = "drive_licence";

    public static final String COL_DRIVER_NAME = "driver_name";

    public static final String COL_ENGINE_NO = "engine_no";

    public static final String COL_GENDER = "gender";

    public static final String COL_GOODS_HEIGHT = "goods_height";

    public static final String COL_ID_CARD = "id_card";

    public static final String COL_INSURANCE_CARD = "insurance_card";

    public static final String COL_PHONE = "phone";

    public static final String COL_REMARK = "remark";

    public static final String COL_RUN_LICENCE = "run_licence";

    public static final String COL_STATE = "state";
}
