public class Main {
    public static void main(String[] args) {
        Meal normalMeal = new Meal();
        normalMeal.printBill();
        // normalMeal.setBurgerSize("large");
        // normalMeal.setBurgerType("Burger Extra Large Cheese");
        // normalMeal.setDrinkSize("large");
        // normalMeal.setDrinkType("Pepsi");
        // normalMeal.setToppingsBurger();
        // normalMeal.printBill();

        DeluxMeal deluxMeal = new DeluxMeal();
        deluxMeal.printBill();
        deluxMeal.setBurgerSize("large");
        deluxMeal.printBill();
        deluxMeal.setToppingsBurger();
        deluxMeal.printBill();
    }
}
