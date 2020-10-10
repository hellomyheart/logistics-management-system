package cn.hellomyheart.logistics.management.system.controller;

import cn.hellomyheart.logistics.management.system.commons.result.CodeMessage;
import cn.hellomyheart.logistics.management.system.commons.result.CodeStatus;
import cn.hellomyheart.logistics.management.system.commons.result.ResponseResult;
import cn.hellomyheart.logistics.management.system.entity.Billinfo;
import cn.hellomyheart.logistics.management.system.entity.Billrelease;
import cn.hellomyheart.logistics.management.system.entity.Goodsreceiptinfo;
import cn.hellomyheart.logistics.management.system.service.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description
 * @className: BillController
 * @package: cn.hellomyheart.logistics.management.system.controller
 * @author: Stephen Shen
 * @date: 2020/10/10 上午9:08
 */
@RequestMapping(value = "/bill")
@ControllerAdvice
@RestController
@Api(value = "单据 controller")
public class BillController {

    @Autowired
    private BillinfoService billinfoService;

    @Autowired
    private BillreleaseService billreleaseService;

    @Autowired
    private GoodsbilleventService goodsbilleventService;

    @Autowired
    private GoodsbillService goodsbillService;

    @Autowired
    private GoodsreceiptinfoService goodsreceiptinfoService;

    @Autowired
    private CargoreceiptService cargoreceiptService;

    @Autowired
    private CargoreceiptdetailService cargoreceiptdetailService;

    @ApiOperation(value = "查询未分发的运单信息", notes = "查询未分发的运单信息")
    @RequestMapping(value = "/findNotRelease", method = RequestMethod.GET)
    public ResponseResult findNotRelease(@RequestParam("pageNum") int pageNum, @RequestParam("limit") int limit) {
        PageInfo<Billinfo> notRelease = billinfoService.findNotRelease(pageNum, limit);
        return new ResponseResult<PageInfo<Billinfo>>(CodeStatus.OK, CodeMessage.SUCCESS, notRelease);
    }

    @ApiOperation(value = "到货", notes = "到货 - 添加一条货物到货回执信息")
    @RequestMapping(value = "/addArrived", method = RequestMethod.POST)
    public ResponseResult addArrived(@RequestBody Goodsreceiptinfo goodsreceiptinfo) {

        int insert = goodsreceiptinfoService.insert(goodsreceiptinfo);
        if (insert > 0) {
            return new ResponseResult(CodeStatus.OK, CodeMessage.SUCCESS);
        }
        return new ResponseResult(CodeStatus.FAIL, CodeMessage.FAIL);

    }



        @ApiOperation(value = "分页查询单据信息", notes = "分页查询单据信息")
    @RequestMapping(value = "/findByPage", method = RequestMethod.GET)
    public ResponseResult findAllByPage(@RequestParam("pageNum") int pageNum, @RequestParam("limit") int limit) {
        PageInfo<Billinfo> all = billinfoService.findAll(pageNum, limit);
        return new ResponseResult<PageInfo<Billinfo>>(CodeStatus.OK, CodeMessage.SUCCESS, all);
    }


    @ApiOperation(value = "分发", notes = "分发 - 添加一条单据分发信息")
    @RequestMapping(value = "/addRelease", method = RequestMethod.POST)
    public ResponseResult addRelease(@RequestBody Billrelease billrelease) {

        boolean flag = false;
        int insert = billreleaseService.insert(billrelease);

        if (insert > 0) {
            return new ResponseResult(CodeStatus.OK, CodeMessage.SUCCESS);
        }
        return new ResponseResult(CodeStatus.FAIL, CodeMessage.FAIL);

    }


}
