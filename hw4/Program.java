package hw1.hw4;

import java.util.ArrayList;
import java.util.List;
import static hw1.hw4.Box.translate;

public class Program {
    public static void main(String[] args) {
        List<Apple> apples1 = new ArrayList<>(List.of(new Apple()));
        List<Apple> apples2 = new ArrayList<>(List.of(new Apple(), new Apple(), new Apple()));
        List<Orange> oranges1 = new ArrayList<>(List.of(new Orange(), new Orange()));
        List<Orange> oranges2 = new ArrayList<>(List.of(new Orange(), new Orange(), new Orange()));

        Box<Apple> appleBox1 = new Box<>(apples1);
        Box<Apple> appleBox2 = new Box<>(apples2);
        Box<Orange> orangeBox1 = new Box<>(oranges1);
        Box<Orange> orangeBox2 = new Box<>(oranges2);

        System.out.println("Первая коробка яблок:\n" + appleBox1);
        System.out.println("Вторая коробка яблок:\n" + appleBox2);
        System.out.println("Первая коробка апельсин:\n" + orangeBox1);
        System.out.println("Вторая коробка апельсин:\n" + orangeBox2);

        System.out.println("Сравним первую коробку яблок и вторую коробку апельсин: " + translate(appleBox1.compare(orangeBox2)));
        System.out.println("Сравним вторую коробку яблок и первую коробку апельсин: " + translate(appleBox2.compare(orangeBox1)));

        appleBox1.put(appleBox2);
        System.out.println("Переложили яблоки из первой коробки во вторую. В первой: \n" + appleBox1 + "\nВо второй:\n" + appleBox2);

        orangeBox1.add(new Orange());
        appleBox1.add(new Apple());
        System.out.println("Добавили в первую коробку апельсин один фрукт\n" + orangeBox1);
        System.out.println("Добавили в первую коробку яблок один фрукт\n" + appleBox1);
    }
}
