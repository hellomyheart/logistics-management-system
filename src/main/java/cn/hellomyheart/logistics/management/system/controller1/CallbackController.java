package cn.hellomyheart.logistics.management.system.controller1;

import cn.hellomyheart.logistics.management.system.commons.result.CodeMessage;
import cn.hellomyheart.logistics.management.system.commons.result.CodeStatus;
import cn.hellomyheart.logistics.management.system.commons.result.ResponseResult;
import cn.hellomyheart.logistics.management.system.entityold.Callbackinfo;
import cn.hellomyheart.logistics.management.system.serviceold.CallbackinfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description 回告管理
 * @className: CallbackController
 * @package: cn.hellomyheart.logistics.management.system.controller
 * @author: Stephen Shen
 * @date: 2020/10/10 下午1:20
 */
//@RestController
//@ControllerAdvice
//@Api(value = "回告 controller")
//@RequestMapping(value = "/callback")
public class CallbackController {

    @Autowired
    private CallbackinfoService callbackinfoService;

    @ApiOperation(value = "添加回告信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseResult addInfo(@RequestBody Callbackinfo callbackinfo) {
        int insert = callbackinfoService.insert(callbackinfo);
        if (insert > 0) {
            return new ResponseResult(CodeStatus.OK, CodeMessage.SUCCESS);
        }
        return new ResponseResult(CodeStatus.FAIL, CodeMessage.FAIL);
    }

    @ApiOperation(value = "查询一条回告信息")
    @RequestMapping(value = "/findDetail/{goodsBillId}/{type}", method = RequestMethod.GET)
    public ResponseResult findDetail(@PathVariable("goodsBillId") String goodsBillId, @PathVariable("type") String type) {
        Callbackinfo callbackinfo = callbackinfoService.selectByPrimaryKey(Integer.valueOf(goodsBillId));
        return new ResponseResult<Callbackinfo>(CodeStatus.OK, CodeMessage.SUCCESS,callbackinfo);

    }




    }
