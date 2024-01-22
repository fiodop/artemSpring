package com.artem.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml", Cat.class);

        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();
        context.close();
    }
}
