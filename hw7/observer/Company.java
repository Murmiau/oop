package hw1.hw7.observer;

import java.util.List;
import java.util.Random;

public class Company {

    private static final Random random = new Random();
    private final String companyName;
    private final double maxSalary;

    private final Publisher jobAgency;

    public Company(String companyName, double maxSalary, Publisher jobAgency) {
        this.companyName = companyName;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public void needEmployee() {
        double salary = random.nextDouble(3000, maxSalary);
        Vacancy vacancy = new Vacancy(companyName, salary);
        List<Observer> workers = jobAgency.sendOffer(vacancy);
        if (workers == null || workers.isEmpty()) {
            System.out.printf("Компания %s не нашла работника с зарплатой %.2f\n", companyName, salary);
        } else {
            workers.sort((o1, o2) -> {
                int grade = Integer.compare(o1.getNumber(), o2.getNumber());
                if (grade == 0)
                    return Double.compare(o1.getMinSalary(), o2.getMinSalary());
                return grade;
            });
            Observer workerToAcceptOffer = workers.get(0);
            System.out.printf("Компания %s нашла работника %s c зарплатой %.2f\n",
                    companyName, workerToAcceptOffer.getName(), workerToAcceptOffer.getMinSalary());
            jobAgency.removeObserver(workerToAcceptOffer);
        }
    }
}