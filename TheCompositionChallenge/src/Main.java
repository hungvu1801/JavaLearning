public class Main {
    public static void main(String[] args) {
        Refrigerator fridge = new Refrigerator(false);
        DishWasher dishWasher = new DishWasher(false);
        CoffeeMaker coffeeMaker = new CoffeeMaker(false);
        SmartKitchen iot = new SmartKitchen(fridge, dishWasher, coffeeMaker);
        // iot.setKitchenState(true, false, true);
        // fridge.setHasWorkToDo(true);
        // fridge.orderFood();
        iot.doKitchenWork();
        iot.setKitchenState(false, true, false);
        iot.doKitchenWork();
    }
}
