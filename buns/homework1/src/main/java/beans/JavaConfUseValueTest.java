package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfUseValueTest {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfig2.class);
        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
