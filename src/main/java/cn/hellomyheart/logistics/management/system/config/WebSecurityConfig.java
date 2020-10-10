package cn.hellomyheart.logistics.management.system.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

/**
 * @description Spring Security的Java配置类
 * @className: WebSecurityConfig
 * @package: cn.hellomyheart.logistics.management.system.config
 * @author: Stephen Shen
 * @date: 2020/10/5 下午4:16
 */

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    //安全拦截机制
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.cors();
        http
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED) //创建session
                .and()
                .csrf().disable() //屏蔽csrf的方式一
                .authorizeRequests()
                .antMatchers("/r/r1").hasAuthority("p1") //权限设置，基于权限授权
                .antMatchers("/r/r2").hasAuthority("p2")
                .antMatchers("/**").authenticated() //所有/r/**,必须认证
                .anyRequest().permitAll()  //其他请求可以访问
                .and()
                .formLogin() //允许表单登录
//                .loginPage("/login-view")//登录页面
                .loginProcessingUrl("/user/login")//指定登录处理的url
                .successForwardUrl("/user/login-success") //自定义登录成功的页面地址
                .and()
                .logout()//自定义退出url
                .logoutUrl("/user/logout");
//                .logoutSuccessUrl("/login-view?logout")
        //运行get方式退出
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout", "GET"));
    }


}
