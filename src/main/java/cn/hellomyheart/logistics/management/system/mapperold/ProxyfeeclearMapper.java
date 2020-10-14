package cn.hellomyheart.logistics.management.system.mapperold;

import cn.hellomyheart.logistics.management.system.entityold.Proxyfeeclear;

public interface ProxyfeeclearMapper {
    /**
     * delete by primary key
     * @param goodsBillCode primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String goodsBillCode);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Proxyfeeclear record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Proxyfeeclear record);

    /**
     * select by primary key
     * @param goodsBillCode primary key
     * @return object by primary key
     */
    Proxyfeeclear selectByPrimaryKey(String goodsBillCode);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Proxyfeeclear record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Proxyfeeclear record);
}
