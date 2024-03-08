public class Main {
    public static void main(String[] args) {
        // Item coke = new Item("drink", "coke", 1.50);
        // coke.printItem();
        // coke.setSize("LARGE");
        // coke.printItem();

        // Item avocado = new Item("Topping", "avocado", 1.50);
        // avocado.printItem();
        // Burger burger = new Burger("CHICKEN", 5.50);

        // burger.addToppings("BACON", "CHEESE", "MAYO");
        // burger.printItem();

        // MealOrder mealdOrderNorm = new MealOrder();
        // mealdOrderNorm.addBurgerToppings("BACON", "CHEESE", "HOT SAUCE");
        // mealdOrderNorm.setDrinkSize("LARGE");
        // mealdOrderNorm.printItemizedList();

        // MealOrder secondMealOrder = new MealOrder("Turkey", "7-up", "chillis");
        // secondMealOrder.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        // secondMealOrder.setDrinkSize("SMALL");
        // secondMealOrder.printItemizedList();

        MealOrder deluxMeal = new MealOrder("delux", "7-up", "chili");
        deluxMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
        deluxMeal.printItemizedList();
    }
}
