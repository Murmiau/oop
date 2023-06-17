package hw1.hw6.srp2;

public abstract class ScannerInfo {
    private static String prompt(String text) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print(text);
        return in.nextLine();
    }

    public static Client getClientInfo(Client client){
        String clientName = prompt("Имя клиента: ");
        String clientEmail = prompt("Email клиента: ");
        String clientPhoneNumber = prompt("Номер телефона: ");

        if(client != null) {
            client.setName(clientName);
            client.setEmail(clientEmail);
            client.setPhoneNumber(clientPhoneNumber);
        } else
            client = new Client(clientName, clientEmail, clientPhoneNumber);
        return client;
    }

    public static Product getProductInfo(Product product){
        String productBrand = prompt("Бренд: ");
        String productModel = prompt("Модель: ");
        double productPrice = Double.parseDouble(prompt("Цена: "));

        if(product != null) {
            product.setBrand(productBrand);
            product.setModel(productModel);
            product.setPrice(productPrice);
        } else
            product = new Product(productBrand, productModel, productPrice);
        return product;
    }

    public static int getQuantity(){
        return Integer.parseInt(prompt("Количество: "));
    }
}
