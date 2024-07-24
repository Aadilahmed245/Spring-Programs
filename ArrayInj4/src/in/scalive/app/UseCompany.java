package in.scalive.app;

import in.scalive.beans.Company;
import in.scalive.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class UseCompany {
    public static void main(String[] args) {
        ApplicationContext container= new ClassPathXmlApplicationContext("/in/scalive/resources/beanconf.xml");
        Company company= container.getBean(Company.class);
        System.out.println(company.getCompName());
        System.out.println("Total Employees="+company.getEmployees().size());
        List<Employee> employees= company.getEmployees();
        for(Employee emp:employees)
        {
            System.out.println(emp.getEmpId()+" "+emp.getEmpName());
        }
    }
}
