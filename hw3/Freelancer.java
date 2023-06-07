package hw1.hw3;
// 20 * 8

public class Freelancer extends Employee {
    private int workHours;

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public Freelancer(String name, String surname, int age, String job, double salary, int workedHours) {
        super(name, surname, age, job, salary);
        this.workHours = workedHours;
    }

    @Override
    public double calculateSalary() {
        return workHours * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; %d лет; Фрилансер; %s; Заработная плата за месяц: %.2f (руб.), Отработано часов: %d, Оплата за час: %.2f (руб.)",
                surname, name, age, job, calculateSalary(), this.workHours, this.salary);
    }
}