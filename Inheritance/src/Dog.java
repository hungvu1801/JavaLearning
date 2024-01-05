public class Dog extends Animal {

    private String earShape;
    private String tailShape;
    public Dog() {
        super("Default", "default", 0);
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), 
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }
    
}
