public class Main {
    public static void main(String[] args)  {

       Car car = Car.getCar("g", "Lamboghini");
       runRace(car); 
       ElectricCar eCar = new ElectricCar("Tesla", 300, 10);
       runRace(eCar);
    //    System.out.println(car);
    //    GasPoweredCar gCar = (GasPoweredCar) car;
    //    System.out.println(gCar);
    //    gCar.drive();
    //    ElectricCar eCar = new ElectricCar("Tesla", 300, 10);
    //    eCar.startEngine();
    //    eCar.drive();
    }
    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
