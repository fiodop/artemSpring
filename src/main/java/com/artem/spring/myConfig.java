package com.artem.spring;

import org.springframework.context.annotation.*;

@PropertySource("myApp-properties")
@Configuration
//@ComponentScan("com")
public class myConfig {

    @Bean
    @Scope("prototype")
    public Pet catBean(){
        return new Cat();
    }
@Bean
    public Pet dogBean(){
        return new Dog();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }

}
