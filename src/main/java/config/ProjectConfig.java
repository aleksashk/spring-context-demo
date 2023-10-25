package config;

import beans.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"beans"})
public class ProjectConfig {

    @Bean
    public Cat cat1(){
        Cat c = new Cat();
        c.setName("Tom");
        return c;
    }

    @Bean
    public Cat cat2(){
        Cat c = new Cat();
        c.setName("Leo");
        return c;
    }

}
