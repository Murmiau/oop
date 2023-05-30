package hw1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public Program() {
    }

    public static void main(String[] args) {
        Product product1 = new Product("ООО Лучшая вода", "Бу", -100.12);
        System.out.println(product1.displayInfo());
        Product bottleOfWater1 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [1]", 115.0, 1.0);
        Product bottleOfWater2 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [2]", 215.0, 1.5);
        Product bottleOfWater3 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [3]", 1115.0, 1.5);
        Product bottleOfWater4 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [4]", 55.0, 2.0);
        System.out.println(bottleOfWater1.displayInfo());
        Product bottleOfMilk1 = new BottleOfMilk("ООО Чистый источник", "Бутылка с молоком", 115.0, 1.5, 10);
        System.out.println(bottleOfMilk1.displayInfo());
        Product snack1 = new Snack("Сникерс", "Шоколадный батончик с арахисом", 65.0, 45.0, 560);
        Product snack2 = new Snack("Баунти", "Шоколадный батончик с кокосом", 95.0, 60.0, 490);
        Product snack3 = new Snack("Марс", "Шоколадный батончик с карамелью", 85.0, 55.0, 510);
        System.out.println(snack1.displayInfo());
        List<Product> products = new ArrayList();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);
        products.add(bottleOfMilk1);
        products.add(snack1);
        products.add(snack2);
        products.add(snack3);
        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(1.0);
        if (bottleOfWaterResult != null) {
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterResult.displayInfo());
        } else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }
        Snack snackResult1 = vendingMachine.getSnack(55.0);
        if (snackResult1 != null) {
            System.out.println("Вы купили: ");
            System.out.println(snackResult1.displayInfo());
        } else {
            System.out.println("Такого снэка нет в наличии в автомате.");
        }
        Snack snackResult2 = vendingMachine.getSnack(85.0);
        if (snackResult2 != null) {
            System.out.println("Вы купили: ");
            System.out.println(snackResult2.displayInfo());
        } else {
            System.out.println("Такого снэка нет в наличии в автомате.");
        }
    }
}
