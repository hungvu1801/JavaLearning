import java.util.Scanner;

public class Meal {
    private Burger burger;
    protected Drink drink;
    protected SideItem sideItem;
    protected Topping topping;
    private double totalToppingPrize = 0;
    protected String extraToppings = "";
    private int numberOFTopping = 3;
    Scanner scanner = new Scanner(System.in);
    public Meal() {
        this.burger = new Burger();
        this.drink = new Drink();
        this.sideItem = new SideItem();
    }
    
    public Meal(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }
    public void setBurger(Burger burger) {
        this.burger = burger;
    }
    public void setDrink(Drink drink) {
        this.drink = drink;
    }
    public void setDrinkSize(String size) {
        this.drink.setSize(size);
    }
    public void setDrinkType(String size) {
        this.drink.setType(size);
    }
    public void setBurgerSize(String size) {
        this.burger.setSize(size);
    }
    public void setBurgerType(String size) {
        this.burger.setType(size);
    }
    public void setSideItem(SideItem sideItem) {
        this.sideItem = sideItem;
    }
    public double getTotalBill() {
        return burger.getPrize() + drink.getPrize() + sideItem.getPrize();
    }
    public void setToppingsBurger() {
        Integer toppingNo = 1;
        while (toppingNo <= numberOFTopping) {
            System.out.printf("Please insert topping no.%d of your choice %n", toppingNo);
            String type = scanner.nextLine(); 
            if (type == "N") continue;
            else {
                topping = new Topping(type);
                System.out.println(topping.getPrize());
                this.totalToppingPrize += topping.getPrize();
                this.extraToppings += topping.getType() + " - ";
            toppingNo += 1;
            }
        }
    }
    protected double getTotalBillAmount() {
        return this.burger.getPrize() + 
                this.drink.getPrize() + 
                this.sideItem.getPrize() + 
                this.totalToppingPrize;
    }

    public void printBill() {
        System.out.printf("Burger : %s -- %s -- %.2f USD %n", 
                this.burger.getType(), 
                this.burger.getSize(), 
                this.burger.getPrize());
        System.out.printf("Drink : %s -- %s -- %.2f USD %n",
                this.drink.getType(),
                this.drink.getSize(),
                this.drink.getPrize());
        System.out.printf("Side item : %s -- %.2f USD %n",
                this.sideItem.getType(),
                this.sideItem.getPrize());
        if (this.totalToppingPrize != 0.0) {
            System.out.printf("Toppings : %s -- %.2f USD %n", this.extraToppings, this.totalToppingPrize);
        }
        System.out.println("--------------------------");
        System.out.println("Total bill: " + getTotalBillAmount());
    }
}
class DeluxMeal extends Meal {
    private int numberOFTopping = 5;
    private double totalToppingPrize = 0;
    private DeluxBurger deluxBurger;

    public DeluxMeal() {
        this.deluxBurger = new DeluxBurger();
        super.drink = new Drink();
        super.sideItem = new SideItem();
    }
    public DeluxMeal(DeluxBurger deluxBurger, Drink drink, SideItem sideItem) {
        this.deluxBurger = deluxBurger;
        super.drink = drink;
        super.sideItem = sideItem;
    }

    @Override
    public void setToppingsBurger() {
        Integer toppingNo = 1;
        while (toppingNo <= this.numberOFTopping) {
            System.out.printf("Please insert topping no.%d of your choice %n", toppingNo);
            String type = scanner.nextLine(); 
            if (type == "N") continue;
            else {
                super.topping = new Topping(type);
                super.extraToppings += topping.getType() + " - ";
            toppingNo += 1;
            }
        }
    }

    @Override
    public void setBurgerType(String size) {
        this.deluxBurger.setType(size);
    }

    @Override
    public void setBurgerSize(String size) {
        this.deluxBurger.setSize(size);
    }

    @Override
    public void printBill() {
        System.out.printf("Burger :     %20s -- %10s -- %6.2f USD %n", 
                this.deluxBurger.getType(), 
                this.deluxBurger.getSize(), 
                this.deluxBurger.getPrize());
        System.out.printf("Drink :     %20s -- %10s -- %6.2f USD %n",
                super.drink.getType(),
                super.drink.getSize(),
                super.drink.getPrize());
        System.out.printf("Side item : %20s -- %6.2f USD %n",
                super.sideItem.getType(),
                super.sideItem.getPrize());
    
        System.out.printf("Toppings : %20s -- %6.2f USD %n", this.extraToppings, this.totalToppingPrize);

        System.out.println("--------------------------");
        System.out.println("Total bill: " + getTotalBillAmount());
    }
    @Override
    protected double getTotalBillAmount() {
        return this.deluxBurger.getPrize() + 
                super.drink.getPrize() + 
                super.sideItem.getPrize() + 
                this.totalToppingPrize;
    }
}