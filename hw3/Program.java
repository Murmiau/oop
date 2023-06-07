package hw1.hw3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Program {

    static Random random = new Random();

    static Employee generateEmployee() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
        String[] jobs = new String[]{"Маляр", "Каменщик", "Водитель", "Разнорабочий", "Токарь", "Штукатурщик", "Прораб", "Уборщик", "Шпаклевщик", "Электрик"};

        String randomName = names[random.nextInt(2)];
        String randomSurname = surnames[random.nextInt(surnames.length)];
        String randomJobs = jobs[random.nextInt(jobs.length)];

        int age = random.nextInt(18, 70);

        if (random.nextInt(2) == 0) {
            int salary = random.nextInt(20000, 80000);
            return new Worker(randomName, randomSurname, age, randomJobs, salary);
        } else {
            int salary = random.nextInt(300, 5000);
            int workedHours = random.nextInt(0, 20 * 8);
            return new Freelancer(randomName, randomSurname, age, randomJobs, salary, workedHours);
        }
    }


    public static void main(String[] args) {

        Employee[] employees = generateArray(10);
        boolean result = true;
        while (result) {
            System.out.println("Выберете, что вы хотите сделать:");
            System.out.println("1 - Вывести список сотрудников с сортировкой по имени");
            System.out.println("2 - Вывести список сотрудников с сортировкой по возрасту");
            System.out.println("3 - Вывести список сотрудников с сортировкой по зарплате");
            System.out.println("4 - Вывести список сотрудников с сортировкой по профессии");
            System.out.println("0 - Выход");
            Scanner scanner = new Scanner(System.in);
            int customerChoiceInt = scanner.nextInt();
            switch (customerChoiceInt) {
                case 1 -> sortByName(employees);
                case 2 -> sortByAge(employees);
                case 3 -> sortBySalary(employees);
                case 4 -> sortByRole(employees);
                case 0 -> result = false;
                default -> System.out.println("Введите цифру в соответствии с вашим выбором: ");
            }
            System.out.println();
        }
    }

    private static Employee[] generateArray(int size) {
        Employee[] employees = new Employee[size];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }
        return employees;
    }

    private static void sortByName(Employee[] employees) {
        Arrays.sort(employees);
        printEmployees(employees);
    }

    private static void sortByAge(Employee[] employees) {
        Arrays.sort(employees, new AgeComparator());
        printEmployees(employees);
    }

    private static void sortBySalary(Employee[] employees) {
        Arrays.sort(employees, new SalaryComparator());
        printEmployees(employees);
    }

    private static void sortByRole(Employee[] employees) {
        Arrays.sort(employees, Comparator.comparing(o -> o.job));
        printEmployees(employees);
    }

    private static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}