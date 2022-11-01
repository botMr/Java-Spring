package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfig.class);
        Person person = context.getBean("personBean", Person.class);
        person.callPet();
        person.whereDog();
        Pet myDog = context.getBean("dog", Pet.class);
        myDog.say();
        context.close();


    }
}
