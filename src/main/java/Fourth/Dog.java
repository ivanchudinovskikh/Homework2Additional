package Fourth;

public class Dog implements Runnable {  // собака бегает
    @Override
    public void run() {
        System.out.println("Пёс побежал");
    }
}
