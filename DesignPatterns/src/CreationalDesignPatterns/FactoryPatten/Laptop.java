package CreationalDesignPatterns.FactoryPatten;

public class Laptop extends ElectronicDevice{

    @Override
    public void display() {
        System.out.println("Using Laptop");
    }
}
