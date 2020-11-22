package exercitiuCurs03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex1SpringApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        IAnimal theAnimal = context.getBean("myAnimal",Dog.class);
        System.out.println(theAnimal.makeSound());

        context.close();
    }

}
