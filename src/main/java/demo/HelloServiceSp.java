package demo;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceSp implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hola, " + name + "!";
    }
}
