package hw1;

public class Snack extends Product {
    private double size;

    private int callories;
    public double getSize() {
        return this.size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getCallories() {
        return this.callories;
    }

    public void setCallories(int callories) {
        this.callories = callories;
    }

    public Snack(String brand, String name, double price, double size, int callories) {
        super(brand, name, price);
        this.size = size;
        this.callories = callories;
    }

    public String displayInfo() {
        return String.format("[Снэк]%s - %s - %.2f - [вес: %.2f; каллории: %d]", this.brand, this.name, this.price, this.size, this.callories);
    }
}
