package beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Owner {
    @Autowired(required = false)
    private Cat cat;

}
