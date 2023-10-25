package demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sp")
public class HelloServiceSp implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hola, " + name + "!";
    }
}
