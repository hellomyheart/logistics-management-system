package cn.hellomyheart.logistics.management.system;

import cn.hellomyheart.logistics.management.system.commons.controller.ControllerUtils;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@MapperScan("cn.hellomyheart.logistics.management.system.mapper")
//使得@WebServlet、@WebFilter、@WebListener注解自动注册
@ServletComponentScan
@ComponentScan(excludeFilters =
        {
                @ComponentScan.Filter(type = FilterType.REGEX,pattern = "cn.hellomyheart.logistics.management.system.commons.*")
        })

// 继承 用于将fastjson替换原有的jackson
public class LogisticsManagementSystemApplication  extends WebMvcConfigurationSupport {

    public static void main(String[] args) {
        SpringApplication.run(LogisticsManagementSystemApplication.class, args);
    }

    // 配置fastJson  用于替代jackson
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        //定义一个convert 转换消息的对象
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        // 2 添加fastjson 的配置信息 比如 是否要格式化 返回的json数据
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(
                SerializerFeature.PrettyFormat
        );
        fastConverter.setFastJsonConfig(fastJsonConfig);
        // 解决乱码的问题
        List<MediaType> fastMediaTypes = new ArrayList<>();
        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        fastConverter.setSupportedMediaTypes(fastMediaTypes);
        converters.add(fastConverter);
    }

    /**
     * 注入bean，用于密码加密
     *
     * @return
     */
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public ControllerUtils controllerUtils(){
        return new ControllerUtils();
    }

}
