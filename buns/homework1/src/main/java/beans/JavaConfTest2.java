package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfTest2 {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfig2.class);
       // Pet cat = context.getBean("catBean", Pet.class);
       // Pet cat2 = context.getBean("catBean", Pet.class);
       // cat.say();
        Person person = context.getBean("personBean", Person.class);
        Person person2 = context.getBean("personBean", Person.class);
       // person.callPet();


        context.close();
    }
}
