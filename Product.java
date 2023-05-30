package hw1;

public class Product {
    protected String name;
    protected String brand;
    protected double price;

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double inputPrice) {
        this.checkPrice(inputPrice);
    }

    public Product() {
        this("product", 100.0);
    }

    public Product(String inputName, double inputPrice) {
        this("noname", inputName, inputPrice);
    }

    public Product(String brand, String name, double price) {
        this.checkPrice(price);
        if (name.length() < 5) {
            this.name = "product";
        } else {
            this.name = name;
        }

        this.brand = brand;
    }

    private void checkPrice(double inputPrice) {
        if (inputPrice <= 0.0) {
            this.price = 100.0;
        } else {
            this.price = inputPrice;
        }

    }

    public String displayInfo() {
        return String.format("%s - %s- %.2f", this.brand, this.name, this.price);
    }
}
