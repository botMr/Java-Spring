package beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("personBean", Person.class);
        person.callPet();
        person.whereCat();
        Pet myCat = context.getBean("catBean", Pet.class);
        myCat.say();
        context.close();

    }
}
