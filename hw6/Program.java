package hw1.hw6;

import hw1.hw6.srp2.Order;
import hw1.hw6.srp2.SaveToJsonFile;

public class Program {

    /**
     * TODO: Задача 1. Домашняя работа. Оптимизировать работу класса Order в  рамках принципа SRP.
     * @param args
     */
    public static void main(String[] args) {
        Order order = new Order();
        SaveToJsonFile.saveToJson(order);
    }

}
