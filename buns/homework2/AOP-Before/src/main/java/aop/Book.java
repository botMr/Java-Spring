package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("1984")
    private String name;

    @Value("Морфий")
    private String add;

    public String getName() {
        return name;
    }

    public String setName(){
        return add;
    }
}
