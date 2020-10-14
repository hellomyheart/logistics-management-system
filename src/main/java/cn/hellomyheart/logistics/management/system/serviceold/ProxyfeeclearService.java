package cn.hellomyheart.logistics.management.system.serviceold;

import cn.hellomyheart.logistics.management.system.entity.Proxyfeeclear;
public interface ProxyfeeclearService{


    int deleteByPrimaryKey(String goodsBillCode);

    int insert(Proxyfeeclear record);

    int insertSelective(Proxyfeeclear record);

    Proxyfeeclear selectByPrimaryKey(String goodsBillCode);

    int updateByPrimaryKeySelective(Proxyfeeclear record);

    int updateByPrimaryKey(Proxyfeeclear record);

}
