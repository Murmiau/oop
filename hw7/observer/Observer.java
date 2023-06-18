package hw1.hw7.observer;

public interface Observer {
    boolean receiveOffer(Vacancy vacancy);

    String getName();

    double getMinSalary();

    int getNumber();
}