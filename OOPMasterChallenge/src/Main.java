public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger("Burger Chicken", "small", "Onions", "Chillis", "Cheese");
        DeluxBurger deluxBurger = new DeluxBurger("Burger Chicken", "large", "Cheese", "Cheese", "Cheese", "Chillis", "Cheese");
        System.out.println(deluxBurger.getPrize());

    }
}
