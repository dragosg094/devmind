package tema;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Task task1 = context.getBean("task2", Task.class);
        context.getBean("task1",Task.class);
        context.getBean("task1",Task.class);
        Task task2 =context.getBean("task2",Task.class);
        context.getBean("task2",Task.class);


        context.close();

    }
}
