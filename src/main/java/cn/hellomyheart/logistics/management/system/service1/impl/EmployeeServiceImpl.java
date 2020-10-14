package cn.hellomyheart.logistics.management.system.service1.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.hellomyheart.logistics.management.system.mapper.EmployeeMapper;
import cn.hellomyheart.logistics.management.system.entity1.Employee;
import cn.hellomyheart.logistics.management.system.service1.EmployeeService;
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService{

}
