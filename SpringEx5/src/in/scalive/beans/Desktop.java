package in.scalive.beans;

public class Desktop implements Computer{

    @Override
    public boolean start() {
        System.out.println("Desktop Started!!!");
        return true;
    }
}
