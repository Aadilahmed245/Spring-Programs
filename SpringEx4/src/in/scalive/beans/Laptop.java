package in.scalive.beans;

public class Laptop {
    private String brand;
    public Laptop()
    {
        System.out.println("Laptop instantiated!!");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("Laptop brand setted!");
        this.brand = brand;
    }
    public boolean start() {
        //some logic
        System.out.println("Laptop started...");
        return true;
    }

}
