package beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Owner {

    private final Cat cat;

    public Owner(Cat cat) {
        this.cat = cat;
    }
}
