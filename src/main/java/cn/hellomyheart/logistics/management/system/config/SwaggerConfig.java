package cn.hellomyheart.logistics.management.system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @description Swagger配置类
 * @className: SwaggerConfig
 * @package: cn.hellomyheart.logistics.management.system.config
 * @author: Stephen Shen
 * @date: 2020/10/4 上午10:26
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    //配置Swagger的Bean实例
    @Bean
    public Docket createDocket(){

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(createApiInfo())
                .groupName("StephenShen")////分组名称(可以创建多个Docket就有多个组名)
                .enable(true)//enable表示是否开启Swagger
                .select()
                //RequestHandlerSelectors指定扫描的包
                .apis(RequestHandlerSelectors.basePackage("cn.hellomyheart.logistics.management.system.controller"))
                .build();
    }

    //配置API的基本信息（会在http://项目实际地址/swagger-ui.html页面显示）
    public ApiInfo createApiInfo(){
        return new ApiInfoBuilder()
                .title("物流管理系统 api 文档")
                .description("物流管理系统接口文档")
                .termsOfServiceUrl("https://www.hellomyheart.cn")
                .build();

        //return ApiInfo.DEFAULT;
    }
}
