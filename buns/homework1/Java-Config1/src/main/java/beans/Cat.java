package beans;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{
    public void say(){
        System.out.println("Я здесь хозяин! Мяу)");
    }
}
