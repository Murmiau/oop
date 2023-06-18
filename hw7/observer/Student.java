package hw1.hw7.observer;

public class Student extends Employee {
    private static final int Number = 1;

    public Student(String name) {
        super(name, Number);
        minSalary = random.nextDouble(2000, 4000);
    }
}