package com.artem.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog myDog = context.getBean("dog", Dog.class);
        Dog yourDog = context.getBean("dog", Dog.class);
        myDog.say();

        System.out.println("переменные ссылаются на один и тот же объект:" + (myDog == yourDog));
        context.close();
    }
}
