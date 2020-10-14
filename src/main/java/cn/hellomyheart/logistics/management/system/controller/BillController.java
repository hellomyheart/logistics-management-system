package cn.hellomyheart.logistics.management.system.controller;

import cn.hellomyheart.logistics.management.system.commons.controller.ControllerUtils;
import cn.hellomyheart.logistics.management.system.commons.result.ResponseResult;
import cn.hellomyheart.logistics.management.system.entity.Billrelease;
import cn.hellomyheart.logistics.management.system.service.BillinfoService;
import cn.hellomyheart.logistics.management.system.service.BillreleaseService;
import cn.hellomyheart.logistics.management.system.service.GoodsreceiptinfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description 单据Controller
 * @className: BillController
 * @package: cn.hellomyheart.logistics.management.system.controller
 * @author: Stephen Shen
 * @date: 2020/10/14 下午7:10
 */
@RestController
@RequestMapping(value = "/bill")
@Api(value = "单据 controller")
public class BillController {

    @Autowired
    private BillinfoService billinfoService;

    @Autowired
    private BillreleaseService billreleaseService;

    @Autowired
    private GoodsreceiptinfoService goodsreceiptinfoService;

    @Autowired
    private ControllerUtils controllerUtils;


    @ApiOperation(value = "分发", notes = "分发 - 添加一条单据分发信息")
    @RequestMapping(value = "/addRelease", method = RequestMethod.POST)
    public ResponseResult addRelease(@RequestBody Billrelease billrelease) {
        return controllerUtils.save(billreleaseService, billrelease);
    }

}
