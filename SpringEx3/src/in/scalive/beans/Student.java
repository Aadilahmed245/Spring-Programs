package in.scalive.beans;

public class Student {
    private int rollNo;
    private String name;
    public Student()
    {
        System.out.println("Student Bean Created....");
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        System.out.println("Setter call of rollNo");
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setter call of name");
        this.name = name;
    }
}
