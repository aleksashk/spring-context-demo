package config;

import beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public MyBean myBean1() {

        MyBean bean = new MyBean();
        bean.setText("Hello");
        return bean;
    }

    @Bean
    public MyBean myBean2() {

        MyBean bean = new MyBean();
        bean.setText("World");
        return bean;
    }
}
