package in.scalive.beans;

public class Programmer {
    private  String name;
    private Laptop lap;
    public Programmer()
    {
        System.out.println("Programmer instantiated!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Name of programmer setted!");
        this.name = name;
    }
    public void writeCode() {
        boolean res=lap.start();
        if(res) {
            System.out.println("Coding started...");
        }else {
            System.out.println("Could not write the code");
        }
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }
}
