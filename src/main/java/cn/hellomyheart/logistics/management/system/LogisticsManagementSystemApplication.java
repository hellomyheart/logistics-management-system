package cn.hellomyheart.logistics.management.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("cn.hellomyheart.logistics.management.system.mapper")
//使得@WebServlet、@WebFilter、@WebListener注解自动注册
@ServletComponentScan
public class LogisticsManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogisticsManagementSystemApplication.class, args);
    }

}
