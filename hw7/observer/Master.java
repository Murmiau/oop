package hw1.hw7.observer;

public class Master extends Employee {
    private static final int Number = 2;

    public Master(String name) {
        super(name, Number);
        minSalary = random.nextDouble(60000, 80000);
    }
}