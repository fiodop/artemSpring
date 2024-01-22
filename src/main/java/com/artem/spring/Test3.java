package com.artem.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
//        Pet pet = new Dog();
//        Person person = new Person(pet);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
