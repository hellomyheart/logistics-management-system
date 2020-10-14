package cn.hellomyheart.logistics.management.system.mapperold;

import cn.hellomyheart.logistics.management.system.entity.Employee;

public interface EmployeeMapper {
    /**
     * delete by primary key
     * @param employeeCode primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String employeeCode);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Employee record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Employee record);

    /**
     * select by primary key
     * @param employeeCode primary key
     * @return object by primary key
     */
    Employee selectByPrimaryKey(String employeeCode);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Employee record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Employee record);
}
