package in.scalive.beans;

public class Laptop implements Computer{
    @Override
    public boolean start() {
        System.out.println("Laptop Started!!!");
        return true;
    }
}
