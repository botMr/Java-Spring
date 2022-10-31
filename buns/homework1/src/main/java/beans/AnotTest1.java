package beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnotTest1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextAnotConfig.xml");
       // Cat myCat = context.getBean("catBean", Cat.class);
       // myCat.say();
        Person person = context.getBean("personBean", Person.class);
        person.callPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();
    }
}
