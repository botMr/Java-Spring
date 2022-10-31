package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
    @Value("${person.age}")
    private int age;
   // @Autowired
   // @Qualifier("catBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;

    public Person(Pet pet) {
        System.out.println("Person created");
        this.pet = pet;
    }
    //@Autowired
    //public Person(@Qualifier("catBean") Pet pet){
    //   System.out.println("Person created");
     //  this.pet = pet;
  // }

    public void callPet(){
        System.out.println("Привет,мой питомец!");
        pet.say();
    }
//@Autowired
//@Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Person() {
        System.out.println("Person created");
    }
}
