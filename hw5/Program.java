package hw1.hw5;

import hw1.hw5.models.Reservation;
import hw1.hw5.models.Table;
import hw1.hw5.models.TableModel;
import hw1.hw5.presenters.BookingPresenter;
import hw1.hw5.presenters.Model;
import hw1.hw5.presenters.View;
import hw1.hw5.presenters.ViewObserver;
import hw1.hw5.views.BookingView;

import javax.swing.table.TableStringConverter;
import java.util.Date;
import java.util.Scanner;
import java.util.Objects;

public class Program {
    static Scanner scanner = new Scanner(System.in);

    /**
     * TODO: Домашняя работа: Метод changeReservationTable ДОЛЖЕН ЗАРАБОТАТЬ!
     * @param args
     */
    public static void main(String[] args) {
        Model tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);

        // Клиент нажимает на кнопку "Зарезервировать", возбуждается событие,
        // вызывается метод reservationTable()

        boolean work = true;
        while (work) {
            System.out.println("Выберете, что вы хотите сделать:");
            System.out.println("1 - Вывести список столиков.");
            System.out.println("2 - Забронировать столик. Для брони введите номер столика, подтвердите " +
                    "клавишей enter, введите имя, также подтвердите.");
            System.out.println("3 - Сменить данные бронирования столика. Для изменения данных введите номер бронирования," +
                    "подтвердите клавшией enter, номер столика, еще раз подтвердите клавишей enter, введите имя, " +
                    "также подтвердите.");
            System.out.println("0 - Выход");
            int customerChoice = scanner.nextInt();
            switch (customerChoice) {
                case 1 -> bookingPresenter.showTables();
                case 2 -> bookingView.reservationTable(new Date(), scanner.nextInt(), scanner.next());
                case 3 -> bookingView.changeReservationTable(scanner.nextInt(), new Date(), scanner.nextInt(), scanner.next());
                case 0 -> {
                    System.out.println("Вы уверены, что хотите выйти? Введите yes для выхода, " +
                            "no для продолжения работы: ");
                    String really_exit = scanner.next();
                    if (Objects.equals(really_exit, "yes")) {
                        System.out.println("Спасибо за то, что воспользовались нашей программой, до новых встреч!");
                        work = false;
                    } else {
                        System.out.println("Продолжаем работу.");
                    }
                }
                default -> System.out.println("Вы ввели неверное значение, повторите ввод!");
            }
            System.out.println();
        }
    }
}
