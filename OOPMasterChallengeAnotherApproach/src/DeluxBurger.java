public class DeluxBurger extends Burger {
    Item delux1;
    Item delux2;

    public DeluxBurger(String name, double price) {
        super(name, price);
    }

    public void addToppings(String extra1, String extra2, String extra3, String delux1, String delux2) {
        super.addToppings(extra1, extra2, extra3);
        this.delux1 = new Item("TOPPING", delux1, 0.0);
        this.delux2 = new Item("TOPPING", delux2, 0.0);
    }
    
    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if (delux1 != null) {
            delux1.printItem();
        }
        if (delux2 != null) {
            delux2.printItem();
        }
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0.0;
    }

}
