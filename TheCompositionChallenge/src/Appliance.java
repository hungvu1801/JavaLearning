public class Appliance {
    protected boolean hasWorkToDo;

    public Appliance(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

class Refrigerator extends Appliance {
    public Refrigerator(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }
    public void orderFood() {
        if (super.hasWorkToDo == true) {
            System.out.println("The food has been ordered..");
            super.hasWorkToDo = false;
        }
    }
}

class DishWasher extends Appliance {
    public DishWasher(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }
    public void doDishes() {
        if (super.hasWorkToDo == true) {
            System.out.println("The dish is loading and cleaning...");
            super.hasWorkToDo = false;
        }
    }

}

class CoffeeMaker extends Appliance {
    public CoffeeMaker(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }
    public void brewCoffee() {
        if (super.hasWorkToDo == true) {
            System.out.println("The coffee and milk are being made... ");
            super.hasWorkToDo = false;
        }
    }

}