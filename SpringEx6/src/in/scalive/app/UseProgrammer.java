package in.scalive.app;

import in.scalive.beans.Programmer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseProgrammer {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("/in/scalive/resources/beanconf.xml");

        Programmer p1= (Programmer) context.getBean("prog1");
        System.out.println("Programmmer 1:"+p1.getName());
        p1.writeCode();

        System.out.println("=======================");

        Programmer p2= (Programmer) context.getBean("prog2");
        System.out.println("Programmer 2:"+p2.getName());
        p2.writeCode();

    }
}
