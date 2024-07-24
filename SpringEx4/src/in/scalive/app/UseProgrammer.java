package in.scalive.app;

import in.scalive.beans.Laptop;
import in.scalive.beans.Programmer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseProgrammer {
    public static void main(String[] args) {
        ApplicationContext context=new 		ClassPathXmlApplicationContext("/in/scalive/resources/beanconf.xml");

        Programmer p=context.getBean(Programmer.class);
        System.out.println("Programmer's name:"+p.getName());
        System.out.println("Programmer's LapTop brand:"+p.getLap().getBrand());
        p.writeCode();

    }
}
