package beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
@Scope
public class Dog implements Pet{
    private String name;
    @Override
    public void say() {
        System.out.println("Гав-гав");
    }
//@PostConstruct
    //public void init(){
    //    System.out.println("Dog class: init method");
   // }
//@PreDestroy
   // public void  destroy(){
     //   System.out.println("Dog class: destroy mehod");
    }


