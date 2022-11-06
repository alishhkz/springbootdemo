package kz.springboot.springbootdemo.config;

import kz.springboot.springbootdemo.beans.FirstBean;
import kz.springboot.springbootdemo.beans.ThirdBean;
import kz.springboot.springbootdemo.beans.ThirdBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public FirstBean firstBean() {
        return new FirstBean();
    }

    @Bean
    public FirstBean secondBean() {
        return new FirstBean("Alisher",20);
    }

    @Bean
    public ThirdBean thirdBean() {
        return new ThirdBeanImpl();
    }

}
