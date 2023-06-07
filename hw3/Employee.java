package hw1.hw3;

public abstract class Employee implements Comparable<Employee> {

    protected String name;
    protected String surname;
    protected int age;
    protected String job;
    protected double salary; // Ставка заработной платы

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, String surname, int age, String job, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.job = job;
        this.salary = salary;
    }

    public abstract double calculateSalary();

    @Override
    public int compareTo(Employee o) {
        int res = name.compareTo(o.name);
        if (res == 0) {
            return Double.compare(calculateSalary(), o.calculateSalary());
        }
        return res;
    }
}