package cn.hellomyheart.logistics.management.system.controller1;

import cn.hellomyheart.logistics.management.system.commons.result.CodeMessage;
import cn.hellomyheart.logistics.management.system.commons.result.CodeStatus;
import cn.hellomyheart.logistics.management.system.commons.result.ResponseResult;
import cn.hellomyheart.logistics.management.system.entityold.Cargoreceipt;
import cn.hellomyheart.logistics.management.system.entityold.Cargoreceiptdetail;
import cn.hellomyheart.logistics.management.system.serviceold.CargoreceiptService;
import cn.hellomyheart.logistics.management.system.serviceold.CargoreceiptdetailService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @description 货运单回执控制器
 * @className: CargoReceiptController
 * @package: cn.hellomyheart.logistics.management.system.controller
 * @author: Stephen Shen
 * @date: 2020/10/10 下午2:23
 */
//@Api(value = "货运单回执 Controller")
//@RestController
//@RequestMapping(value = "/vehicle")
public class CargoReceiptController {

    @Autowired
    private CargoreceiptService cargoreceiptService;

    @Autowired
    private CargoreceiptdetailService cargoreceiptdetailService;

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


    /**
     * 查询货运回执单编号
     */
    @RequestMapping(value = "/selectCode", method = RequestMethod.GET)
    public ResponseResult selectAllCodes() {
        List<Cargoreceiptdetail> cargoreceiptdetail = cargoreceiptdetailService.selectAll();
        List result = new ArrayList();
        for (int i = 0; i < cargoreceiptdetail.size(); i++) {
            result.add(cargoreceiptdetail.get(i).getGoodsRevertBillId());
        }
        return new ResponseResult<List>(CodeStatus.OK, CodeMessage.SUCCESS, result);
    }

    @ApiOperation(value = "查询未被安排的货运单")
    @RequestMapping(value = "/selectLeftCodes", method = RequestMethod.GET)
    public ResponseResult selectLeftCodes() {
        List<Cargoreceiptdetail> cargoreceiptdetails = cargoreceiptdetailService.selectPreCode();
        List result = new ArrayList();
        for (int i = 0; i < cargoreceiptdetails.size(); i++) {
            result.add(cargoreceiptdetails.get(i).getGoodsRevertBillId());
        }
        return new ResponseResult<List>(CodeStatus.OK, CodeMessage.SUCCESS, result);

    }

}
