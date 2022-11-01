package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(JavaConfig2.class);
        Person person = context.getBean("personBean", Person.class);
        person.callPet();
        person.whereDog();
        Pet myDog = context.getBean("dogBean", Pet.class);
        myDog.say();
        context.close();
    }
}
