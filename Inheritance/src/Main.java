public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal,"slow");
        
        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");
        
        Dog yorkie =  new Dog("Yorky", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador Retriever", 65, 
                "Flopppy", "Swimmer");
        doAnimalStuff(retriever, "slow");
        // System.out.println(dog);

        Dog wolf = new Dog("Wolf", 70);
        doAnimalStuff(wolf, "fast");

        Fish goldie = new Fish("GoldFish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("________");
    }
}
