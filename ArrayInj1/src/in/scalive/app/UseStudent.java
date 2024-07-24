package in.scalive.app;

import in.scalive.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class UseStudent {
    public static void main(String[] args) {
        ApplicationContext container= new ClassPathXmlApplicationContext("/in/scalive/resources/beanconf.xml");
        Student s= container.getBean(Student.class);
        System.out.println(s.getName()+" "+s.getRollNo()+" "+ Arrays.toString(s.getSubjects()));
    }
}
