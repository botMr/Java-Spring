package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfTest {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
               new AnnotationConfigApplicationContext(JavaConfig1.class);
        Person person = context.getBean("personBean", Person.class);
        person.callPet();
        context.close();
    }
}
