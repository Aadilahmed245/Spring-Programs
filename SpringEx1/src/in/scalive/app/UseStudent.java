package in.scalive.app;

import in.scalive.beans.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class UseStudent {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("/in/scalive/resources/beanconf.xml");
        BeanFactory container = new XmlBeanFactory(resource);
        System.out.println("Container Started");
      //  Student student= (Student) container.getBean("stObj");
        Student student = container.getBean(Student.class);
        System.out.println("Name = "+student.getName());
        System.out.println("Roll No = "+student.getRollNo());
    }
}
