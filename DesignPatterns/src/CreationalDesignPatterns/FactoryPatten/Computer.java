package CreationalDesignPatterns.FactoryPatten;

public class Computer extends ElectronicDevice{

    @Override
    public void display() {
        System.out.println("Using Computer");
    }
}
