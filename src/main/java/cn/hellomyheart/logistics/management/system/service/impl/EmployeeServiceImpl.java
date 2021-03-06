package cn.hellomyheart.logistics.management.system.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.hellomyheart.logistics.management.system.mapper.EmployeeMapper;
import cn.hellomyheart.logistics.management.system.entity.Employee;
import cn.hellomyheart.logistics.management.system.service.EmployeeService;
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService{

}
