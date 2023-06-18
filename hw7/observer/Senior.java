package hw1.hw7.observer;

public class Senior extends Employee {
    private static final int Number = 3;

    public Senior(String name) {
        super(name, Number);
        minSalary = random.nextDouble(120000, 160000);
    }
}