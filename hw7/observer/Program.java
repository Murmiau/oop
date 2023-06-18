package hw1.hw7.observer;

public class Program {

    /**
     * TODO: 1. Доработать приложение, поработать с шаблоном проектирования Observer,
     *  добавить свой собственный тип/типы соискателя.
     *  2**. Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  3**. Предусмотреть тип вакансии (enum)
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);
        Company mail = new Company("Mail", 140000, jobAgency);
        Company yahoo = new Company("Yahoo", 160000, jobAgency);

        Master ivanov = new Master("Ivanov");
        Master petrov = new Master("Petrov");
        Master filimonov = new Master("Filimonov");
        Student sidorov = new Student("Sidorov");
        Student bolshakov = new Student("Bolshakov");
        Student ismailov = new Student("Ismailov");
        Senior bogdanov = new Senior("Bogdanov");
        Senior beliakov = new Senior("Beliakov");
        Senior marshakov = new Senior("Marshakov");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(filimonov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(bolshakov);
        jobAgency.registerObserver(ismailov);
        jobAgency.registerObserver(bogdanov);
        jobAgency.registerObserver(beliakov);
        jobAgency.registerObserver(marshakov);

        for (int i = 0; i < 2; i++) {
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
            mail.needEmployee();
            yahoo.needEmployee();
        }
    }
}