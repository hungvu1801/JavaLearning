public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setColor("Red"); 
        car.setDoors(2); 
        car.setConvertible(true);
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targar = new Car();
        targar.setMake("Maserati");
        targar.setColor("red"); 
        targar.setModel("Targa");
        targar.setDoors(2); 
        targar.setConvertible(false);
        // System.out.println("make = " + targar.getMake());
        // System.out.println("model = " + targar.getModel());
        targar.describeCar();

        // Test SimpleCalculator class
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

        //

        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}
