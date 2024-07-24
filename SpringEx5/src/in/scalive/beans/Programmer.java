package in.scalive.beans;

public class Programmer {
     private  Computer comp;
     private String name;
    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }
    public void writeCode()
    {
        boolean start= comp.start();
        if(start)
        {
            System.out.println("Coding started!!!");
        }
        else{
            System.out.println("Coding Not Started!!!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
