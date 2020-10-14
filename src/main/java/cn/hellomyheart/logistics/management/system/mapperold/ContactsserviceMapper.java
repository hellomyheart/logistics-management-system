package cn.hellomyheart.logistics.management.system.mapperold;

import cn.hellomyheart.logistics.management.system.entity.Contactsservice;

public interface ContactsserviceMapper {
    /**
     * delete by primary key
     * @param sendGoodsCustomer primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String sendGoodsCustomer);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Contactsservice record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Contactsservice record);

    /**
     * select by primary key
     * @param sendGoodsCustomer primary key
     * @return object by primary key
     */
    Contactsservice selectByPrimaryKey(String sendGoodsCustomer);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Contactsservice record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Contactsservice record);
}
