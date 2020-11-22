package com.devmind.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exercitiul2 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // create the object
        ITeacher theTeacher = context.getBean("myTeacher", ITeacher.class);

        // use the object
        System.out.println(theTeacher.getHomework());

        ITeacher theTeacher1 = context.getBean("myTeacher1", ITeacher.class);

        System.out.println(theTeacher1.getHomework());
        context.close();
    }
}
