package hw1.hw4;

import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> fruits;

    public Box(List<T> fruits) {
        this.fruits = fruits;
    }

    public float getWeight() {
        float result = 0;
        for (Fruit f : fruits) {
            result += f.getWeight();
        }
        return result;
    }

    public String getName() {
        String result = "";
        for (Fruit f : fruits) {
            result = f.getName();
        }
        return result;
    }

    public void add(T n) {
        fruits.add(n);
    }

    public boolean compare(Box<? extends Fruit> otherBox) {
        return this.getWeight() == otherBox.getWeight();
    }

    public static String translate(boolean trueOrFalse) {
        return trueOrFalse ? "true - коробки равны" : "false - коробки не равны";
    }

    public void put(Box<T> otherBox) {
        for (T f : fruits)
            otherBox.add(f);
        fruits.clear();
    }

    @Override
    public String toString() {
        return String.format("В коробке %s %d фруктов с весом %.1f кг", this.getName(), fruits.size(), this.getWeight());
    }
}
