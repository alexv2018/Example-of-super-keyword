package com.github.alexv2018.superclass;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vendin on 18.10.2017.
 */

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        DefaultInterface defaultInterface = (DefaultInterface) context.getBean("defaultInterface");
        defaultInterface.test();
    }
}
