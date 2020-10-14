package cn.hellomyheart.logistics.management.system.commons.controller;

import cn.hellomyheart.logistics.management.system.commons.entity.BaseEntity;
import cn.hellomyheart.logistics.management.system.commons.result.CodeMessage;
import cn.hellomyheart.logistics.management.system.commons.result.CodeStatus;
import cn.hellomyheart.logistics.management.system.commons.result.ResponseResult;
import cn.hellomyheart.logistics.management.system.commons.service.BaseService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;

import java.io.Serializable;
import java.util.List;


/**
 * @description Controller帮助类
 * @className: ControllerUtils
 * @package: cn.hellomyheart.logistics.management.system.commons.controller
 * @author: Stephen Shen
 * @date: 2020/10/14 下午3:04
 */
public class ControllerUtils {


    /**
     * 插入一条记录
     *
     * @param e
     * @return
     */
    public <S extends BaseService<E>, E extends BaseEntity> ResponseResult save(S s, E e) {
        boolean save = s.save(e);
        return result(save);
    }

    /**
     * 根据Id修改一条记录
     *
     * @param e
     * @return
     */
    public <S extends BaseService<E>, E extends BaseEntity> ResponseResult updateById(S s, E e) {
        boolean update = s.updateById(e);
        return result(update);
    }

    /**
     * 根据ID删除
     *
     * @param id
     * @return
     */
    public <S extends BaseService<E>, E extends BaseEntity> ResponseResult removeById(S s, Serializable id) {
        boolean removeById = s.removeById(id);
        return result(removeById);
    }

    /**
     * 查询
     *
     * @param queryWrapper
     * @return
     */
    public <S extends BaseService<E>, E extends BaseEntity> ResponseResult list(S s, Wrapper<E> queryWrapper) {
        List<E> list = s.list(queryWrapper);
        return result(list);
    }

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    public <S extends BaseService<E>, E extends BaseEntity> ResponseResult getById(S s, Serializable id) {
        E byId = s.getById(id);
        return result(byId);
    }

    /**
     * 根据 Wrapper，查询一条记录
     *
     * @param queryWrapper
     * @return
     */
    public <S extends BaseService<E>, E extends BaseEntity> ResponseResult getOne(S s, Wrapper<E> queryWrapper) {
        E one = s.getOne(queryWrapper);
        return result(one);
    }


    public ResponseResult result(boolean flag) {
        if (flag) {
            return new ResponseResult(CodeStatus.OK, CodeMessage.SUCCESS);
        }
        return new ResponseResult(CodeStatus.FAIL, CodeMessage.FAIL);
    }

    public ResponseResult result(List list) {
        return new ResponseResult(CodeStatus.OK, CodeMessage.SUCCESS, list);
    }


    public <E extends BaseEntity> ResponseResult result(E e) {
        if (e != null) {
            return new ResponseResult(CodeStatus.OK, CodeMessage.SUCCESS, e);
        }
        return new ResponseResult(CodeStatus.FAIL, CodeMessage.FAIL);
    }


}
