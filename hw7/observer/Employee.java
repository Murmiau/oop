package hw1.hw7.observer;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class Employee implements Observer {
    protected final String name;
    protected double minSalary;
    protected static final Random random = new Random();
    private final int Number;
    private static final Map<Integer, String> workersMap = new HashMap<>() {{
        put(1, "Студент");
        put(2, "Мастер");
        put(3, "Сеньёр");
    }};

    public Employee(String name, int number) {
        this.name = name;
        Number = number;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getMinSalary() {
        return minSalary;
    }

    @Override
    public int getNumber() {
        return Number;
    }

    @Override
    public boolean receiveOffer(Vacancy vacancy) {
        if (minSalary <= vacancy.salary()) {
            System.out.printf("%s %s хочет зарплату: %.2f, т.ч. эта работа ему подходит! [%s - %.2f]\n",
                    workersMap.get(Number), name, minSalary, vacancy.companyName(), vacancy.salary());
            return true;
        }
        System.out.printf("%s %s хочет зарплату: %.2f, т.ч. эта работа ему не подходит! [%s - %.2f]\n",
                workersMap.get(Number), name, minSalary, vacancy.companyName(), vacancy.salary());
        return false;
    }
}