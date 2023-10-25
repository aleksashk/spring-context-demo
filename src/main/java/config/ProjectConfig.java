package config;

import beans.Cat;
import beans.Owner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Cat cat() {
        Cat cat = new Cat();
        cat.setName("Tom");
        return cat;
    }

    @Bean
    public Owner owner() {
        Owner owner = new Owner();
        owner.setCat(cat());
        return owner;
    }
}
