public class Item {
    protected String name;
    protected String type;
    protected double prize = 0.0;
    public Item() {}
    public Item(double prize, String type) {
        this.prize = prize;
        this.type = type.toUpperCase();
    }
    
    protected void setPrize(double prize) {
        this.prize = prize;
    }
    protected void setType(String type) {
        this.type = type.toUpperCase();
    }

    public double getPrize() {
        return prize;
    }
    public String getType() {
        return type;
    }
}

class Drink extends Item {

    private String size;

    public Drink() {
        super(1.1, "Coke");
        this.size = "small";
    }
    public Drink(String type) {
        super(1.1, type);
        this.size = "small";
    }
    public Drink(String size, String type) {
        super(size == "small" ? 1.1 : (size == "regular" ? 2.0 : 3.5), type);
    }
    public Drink(double prize, String type, String size) {
        super(size == "small" ? 1.1 : (size == "regular" ? 2.0 : 3.5), type);
        this.size = size;
    }
    public void setSize(String size) {
        this.size = size;
        super.prize = this.size == "small" ? 1.1 : (this.size == "regular" ? 2.0 : 3.5);
    }
    public String getType() {
        return super.type;
    }
    public double getPrize() {
        return super.prize;
    }
    public String getSize() {
        return this.size;
    }
}

class Burger extends Item {

    protected String size;
    public Burger() {
        super(5.0, "Cheese Burger");
        this.size = "regular";
    }
    public Burger(String size, String type) {
        super(size == "small" ? 3.5 : (size == "regular" ? 5.0 : 7.5), type);
    }    
    public Burger(double prize, String type, String size) {
        super(size == "small" ? 3.5 : (size == "regular" ? 5.0 : 7.5), type);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
        super.prize = size == "small" ? 3.5 : (size == "regular" ? 5.0 : 7.5);
    }

    public String getType() {
        return super.type;
    }
    public double getPrize() {
        return super.prize;
    }
}

class SideItem extends Item {

    public SideItem(){
        super(3.0, "Fries");
    }
    public SideItem(double prize, String size) {
        super(prize, "Fries");
    }
    public String getType() {
        return super.type;
    }
    public double getPrize() {
        return super.prize;
    }
    public void setType(String type) {
        super.type = type;
    }
    public void setPrize(double prize) {   
        super.prize = prize;
    }
}

class DeluxBurger extends Burger {

    public DeluxBurger() {
        super.prize = 12.0;
        super.type = "Delux " + type;
        super.size = "regular";
    }
    public DeluxBurger(String size, String type) {
        super.size = size; 
        super.type = "Delux " + type;
        super.prize = size == "small" ? 7.0 : (type == "regular" ? 12.0 : 17.0);
    }
    
    @Override
    public double getPrize() {
        return super.prize;
    }

    @Override
    public void setSize(String size) {
        this.size = size;
        super.prize = size == "small" ? 7.0 : (type == "regular" ? 12.0 : 17.0);
    }
    @Override
    public void setType(String type) {
        super.type = "Delux " + type;
    }
}

class Topping extends Item {

    public Topping() {
        super(0.0, "No topping");
    }
    public Topping(String type) {
        super.type = type;
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

    public void setType(String type) {
        super.type = type;
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
    public void setPrice() {
        super.prize = 0.0;
    }
    public String getType() {
        return super.type;
    }
    public double getPrize() {
        return super.prize;
    }
}