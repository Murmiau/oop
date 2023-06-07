package hw1.hw3;

public class Worker extends Employee {

    public Worker(String name, String surname, int age, String job, double salary) {
        super(name, surname, age, job, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; %d лет; Постоянный сотрудник; %s; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)", surname, name, age, job, calculateSalary());
    }
}