public class Car {
    private String description;
    
    public Car(String description) {
        this.description = description;
    }
    public Car() {}
    public static Car getCar(String type, String description) {
        return switch(type.toUpperCase().charAt(0)) {
            case 'G' -> new GasPoweredCar(description);
            case 'E' -> new ElectricCar(description);
            case 'H' -> new HybridCar(description);
            default -> new Car();
        };
    }
    public void startEngine() {
        System.out.println("Start engine Car");
    }
    public void drive() {
        String instanceType = getClass().getSimpleName(); // this.getClass().getSimpleName()
        System.out.println("This is a " + instanceType + " type");
        runEngine();
    }
    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }
}
class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }
    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }
    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLitre);
    }
    
}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;
    public ElectricCar(String description) {
        super(description);
    }
    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Start engine Using Battery");
    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private double avgKmPerCharge;
    private int cylinders;
    private int batterySize;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLitre, double avgKmPerCharge, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.avgKmPerCharge = avgKmPerCharge;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Start engine Using Gas OR Battery");
    }

}