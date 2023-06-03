package hw1.hw2;

import java.util.Scanner;

public class main {
    public static Scanner my_sc = new Scanner(System.in);

    public static void main(String[] args) {

        cat[] myCats = new cat[5];
        myCats[0] = new cat("Барсик", 5, false);
        myCats[1] = new cat("Рыжик", 40, false);
        myCats[2] = new cat("Пушок", 15, false);
        myCats[3] = new cat("Мурзик", 55, false);
        myCats[4] = new cat("Черныш", 35, false);

        plate plate = new plate(100);
        plate.info();

        for (int i = 0; i < myCats.length; i++) {
            if (myCats[i].satiety == false && myCats[i].appetite <= plate.food) {
                myCats[i].eat(plate);
                myCats[i].satiety = true;
                System.out.println("Кот " + myCats[i].name + " поел!");
                plate.info();
            } else {
                System.out.println("Кот " + myCats[i].name + " не поел!");
                plate.info();
            }
        }

        System.out.println("Сколько грамм корма добавить в миску?");
        int addFood = my_sc.nextInt();
        plate.setFood(addFood);
        plate.info();

        for (int i = 0; i < myCats.length; i++) {
            if (myCats[i].satiety == false && myCats[i].appetite <= plate.food) {
                myCats[i].eat(plate);
                myCats[i].satiety = true;
                System.out.println("Кот " + myCats[i].name + " поел!");
            } else if (myCats[i].satiety == false && myCats[i].appetite > plate.food) {
                System.out.println("Кот " + myCats[i].name + " не поел!");
            }
        }
        plate.info();
    }
}