package cn.hellomyheart.logistics.management.system.mapperold;

import cn.hellomyheart.logistics.management.system.entityold.Billinfo;

import java.util.List;

public interface BillinfoMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Billinfo record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Billinfo record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Billinfo selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Billinfo record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Billinfo record);


    List<Billinfo> findNotRelease();

    List<Billinfo> findAll();
}
