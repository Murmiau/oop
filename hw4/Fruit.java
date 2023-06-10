package hw1.hw4;

public abstract class Fruit {
    private final float weight;
    private final String name;

    public Fruit(float weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
