package cn.hellomyheart.logistics.management.system.controller;

import cn.hellomyheart.logistics.management.system.commons.result.CodeMessage;
import cn.hellomyheart.logistics.management.system.commons.result.CodeStatus;
import cn.hellomyheart.logistics.management.system.commons.result.ResponseResult;
import cn.hellomyheart.logistics.management.system.entity.Callbackinfo;
import cn.hellomyheart.logistics.management.system.service.CallbackinfoService;
import io.swagger.annotations.Api;
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
@RestController
@ControllerAdvice
@Api(value = "回告 controller")
@RequestMapping(value = "/callback")
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


}
