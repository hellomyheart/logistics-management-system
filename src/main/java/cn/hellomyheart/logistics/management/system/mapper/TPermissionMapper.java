package cn.hellomyheart.logistics.management.system.mapper;

import cn.hellomyheart.logistics.management.system.entity.TPermission;
import cn.hellomyheart.logistics.management.system.commons.mapper.BaseMapper;

import java.util.List;

public interface TPermissionMapper extends BaseMapper<TPermission> {

    List<TPermission> selectPermissionsByUserId(String userId);
}
