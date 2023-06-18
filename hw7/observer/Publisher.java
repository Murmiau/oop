package hw1.hw7.observer;

import java.util.List;

public interface Publisher {

    /**
     * Регистрация нового наблюдателя
     */
    void registerObserver(Observer observer);

    /**
     * Убрать наблюдателя из списка
     */
    void removeObserver(Observer observer);

    /**
     * Компания отправляет новую вакансию
     */
    List<Observer> sendOffer(Vacancy vacancy);
}