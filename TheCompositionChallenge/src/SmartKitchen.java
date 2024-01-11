public class SmartKitchen {
    private Refrigerator fridge;
    private DishWasher dishwasher;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen(Refrigerator fridge, 
            DishWasher dishwasher, 
            CoffeeMaker coffeeMaker) {

        this.fridge = fridge;
        this.dishwasher = dishwasher;
        this.coffeeMaker = coffeeMaker;
    }

    public void setKitchenState(boolean setCoffee, 
            boolean setFridge, boolean setDishWasher) {
        addWater(setCoffee);
        pourMilk(setFridge);
        loadDishWasher(setDishWasher);
    }

    private void addWater(boolean setCoffee) {
        coffeeMaker.setHasWorkToDo(setCoffee);
    }
    private void pourMilk(boolean setFridge) {
        fridge.setHasWorkToDo(setFridge);
    }
    private void loadDishWasher(boolean setDishWasher) {
        dishwasher.setHasWorkToDo(setDishWasher);
    }

    public void doKitchenWork() {
        this.fridge.orderFood();
        this.dishwasher.doDishes();
        this.coffeeMaker.brewCoffee();
    }
 
}
