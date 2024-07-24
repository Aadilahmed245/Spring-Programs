package in.scalive.app;

import in.scalive.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("/in/scalive/resources/beanconf.xml");
        System.out.println("===============================");
        System.out.println("First Bean");
        Student student1 = (Student)container.getBean("stObj1");
        System.out.println("Name = "+student1.getName());
        System.out.println("Roll No = "+student1.getRollNo());
        System.out.println("===============================");
        System.out.println("Second Bean");
        Student student2 = (Student) container.getBean("stObj2");
        System.out.println("Name = "+student2.getName());
        System.out.println("Roll No = "+student2.getRollNo());
        System.out.println("===============================");
        System.out.println("Third Bean");
        Student student3 = (Student) container.getBean("stObj1");
        System.out.println("Name = "+student3.getName());
        System.out.println("Roll No = "+student3.getRollNo());
        System.out.println(student1==student3);
    }
}
