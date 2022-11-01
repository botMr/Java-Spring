package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    @Autowired
    @Qualifier("catBean")
    private Pet pet;
    public void callPet(){
        System.out.println("Привет питомец!");
        pet.say();
    }

    public void whereDog(){
        System.out.println("Где мой пёс?");
    }

}

