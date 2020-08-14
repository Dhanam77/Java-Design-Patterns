package CreationalDesignPatterns.FactoryPatten;

public class ElectronicDeviceFactory {

    private static ElectronicDevice electronicDevice;

    public static ElectronicDevice getElectronicDevice(String electronicDeviceType) {
        electronicDeviceType = electronicDeviceType.toLowerCase();
        switch (electronicDeviceType) {
            case "computer": {
                return new Computer();
            }
            case "mobile": {
                return new Mobile();
            }
            case "laptop": {
                return new Laptop();
            }
            case "tablet": {
                return new Tablet();
            }
        }
        return null;
    }
}
