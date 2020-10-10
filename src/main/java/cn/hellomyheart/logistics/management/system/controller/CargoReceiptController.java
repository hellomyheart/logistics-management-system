package cn.hellomyheart.logistics.management.system.controller;

import cn.hellomyheart.logistics.management.system.commons.result.CodeMessage;
import cn.hellomyheart.logistics.management.system.commons.result.CodeStatus;
import cn.hellomyheart.logistics.management.system.commons.result.ResponseResult;
import cn.hellomyheart.logistics.management.system.entity.Cargoreceipt;
import cn.hellomyheart.logistics.management.system.service.CargoreceiptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description 货运单回执控制器
 * @className: CargoReceiptController
 * @package: cn.hellomyheart.logistics.management.system.controller
 * @author: Stephen Shen
 * @date: 2020/10/10 下午2:23
 */
@Api(value = "货运单回执 Controller")
@RestController
@RequestMapping(value = "/vehicle")
public class CargoReceiptController {

    @Autowired
    private CargoreceiptService cargoreceiptService;

    /**
     * 填写货运回执单主表
     */
    @ApiOperation(value = "添加货运回执单主表", notes = "添加货运回执单主表")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
    public ResponseResult add(@RequestBody Cargoreceipt cargoreceipt) {

        int insert = cargoreceiptService.insert(cargoreceipt);
        if (insert > 0) {
            return new ResponseResult(CodeStatus.OK, CodeMessage.SUCCESS);
        }
        return new ResponseResult(CodeStatus.FAIL, CodeMessage.FAIL);
    }


}
