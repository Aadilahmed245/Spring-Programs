package in.scalive.beans;

import java.util.List;

public class Company {
    private String compName;
    private List<Employee> employees;
    public Company()
    {

    }
    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }


    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
