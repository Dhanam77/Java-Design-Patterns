package CreationalDesignPatterns.FactoryPatten;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        /*
        ElectronicDevice electronicDevice = new Computer();
        ElectronicDevice electronicDevice = new Mobile();

         */
        ElectronicDevice computerDevice = ElectronicDeviceFactory.getElectronicDevice("computer");
        ElectronicDevice mobileDevice = ElectronicDeviceFactory.getElectronicDevice("mobile");
        computerDevice.display();
        mobileDevice.display();
    }
}
