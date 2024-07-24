package in.scalive.app;

import in.scalive.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("/in/scalive/resources/beanconf.xml");
        System.out.println("Container Started");
        Student student = container.getBean(Student.class);
        System.out.println("Name = "+student.getName());
        System.out.println("Roll No = "+student.getRollNo());
    }
}
