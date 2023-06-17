package hw1.hw6.srp2;

public class Order {

    private static int count;
    private final int id;
    private Client client;
    private Product product;
    private int qnt;

    static {
        count = 1;
    }

    public Order() {
        id = count++;
        inputFromConsole();
    }

    public Order(Client client, Product product, int qnt, int id) {
        this.client = client;
        this.product = product;
        this.qnt = qnt;
        this.id = count++;
    }
    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public double getPrice() {
        return product.getPrice();
    }

    public int getId() {
        return id;
    }

    public void inputFromConsole(){
        client = ScannerInfo.getClientInfo(client);
        product = ScannerInfo.getProductInfo(product);
        qnt = ScannerInfo.getQuantity();
    }
}
