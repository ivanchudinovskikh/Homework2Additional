package Second;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal fish = new Fish();
        Animal duck = new Duck();

        cat.move();
        fish.move();
        duck.move();
    }
}
