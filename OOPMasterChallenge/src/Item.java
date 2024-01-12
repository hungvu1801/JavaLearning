public class Item {
    private String type;
    protected double prize = 0.0;
    public Item() {}
    public Item(double prize, String type) {
        this.prize = prize;
        this.type = type;
    }
    
    public void setPrize(double prize) {
        this.prize = prize;
    }
    public void setType(String type) {
        this.type = type;
    }

    public double getPrize() {
        return prize;
    }
    public String getType() {
        return type;
    }
}

class Drink extends Item {
    private String size = "small";

    public Drink() {
        super(1.1, "Coke");
    }
    public Drink(String type) {
        super(1.1, type);
    }
    public Drink(String size, String type) {
        super(size == "small" ? 1.1 : (size == "regular" ? 2.0 : 3.5), type);
    }
}

class Burger extends Item {
    public Burger() {
        super(5.0, "Cheese Burger");
    }
    public Burger(String size, String type) {
        super(size == "small" ? 3.5 : (size == "regular" ? 5.0 : 7.5), type);
    }    
}


class SideItem extends Item {

    public SideItem(){
        super(3.0, "Fries");
    }
    public SideItem(double prize, String size) {
        super(prize, "Fries");
    }
}

class DeluxBurger extends Burger {
    public DeluxBurger() {
        
    }
}

class Topping extends Item {

    public void getPriceTopping(String type) {
        super.prize =  switch (type) {
            case "Onions" -> 0.5;
            case "Chillis" -> 0.2;
            case "Cheese" -> 0.4;
            case "Salad" -> 0.5;
            case "Beef" -> 1.0;
            case "Egg" -> 0.85;
            default -> 0.0;
        };
    }
}