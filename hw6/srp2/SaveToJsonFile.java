package hw1.hw6.srp2;

import java.io.FileWriter;
import java.io.IOException;

public abstract class SaveToJsonFile {
    public static void saveToJson(Order order) {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            Client client = order.getClient();
            Product product = order.getProduct();
            writer.write("{\n");
            writer.write("\"id клиента\":\""+ order.getId() + "\",\n");
            writer.write("\"Имя клиента\":\""+ client.getName() + "\",\n");
            writer.write("\"Email клиента\":\"" + client.getEmail() + "\",\n");
            writer.write("\"Номер телефона клиента\":\"" + client.getPhoneNumber() + "\",\n");
            writer.write("\"Бренд\":\"" + product.getBrand() + "\",\n");
            writer.write("\"Модель\":\"" + product.getModel() + "\",\n");
            writer.write("\"Цена\":" + product.getPrice() + ",\n");
            writer.write("\"Количество\":" + order.getQnt() + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
