package beans;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("myApp.properties")
public class JavaConfig2 {

    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return new Cat();
    }
    @Bean
    public Person personBean(){
        return new Person(catBean());
    }
}
