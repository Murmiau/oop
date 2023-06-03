package hw1.hw2;

public class cat {
    String name;
    int appetite;
    boolean satiety;

    public cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(plate x) {
        x.getFood(appetite);
    }
}