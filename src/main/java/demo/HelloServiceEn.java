package demo;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceEn implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
