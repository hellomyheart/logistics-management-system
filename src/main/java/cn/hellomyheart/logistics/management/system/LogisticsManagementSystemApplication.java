package cn.hellomyheart.logistics.management.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.hellomyheart.logistics.management.system.mapper")
public class LogisticsManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogisticsManagementSystemApplication.class, args);
    }

}
