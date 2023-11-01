package Fifth;

public class Cat {
    private String name; // ошибка в ограничении доступа!
    private int age;     // ошибка в ограниении доступа!
    private int weight;  // ошибка в ограничении и отсутствие геттера и сеттера!

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}