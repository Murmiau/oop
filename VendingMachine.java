package hw1;

import java.util.Iterator;
import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(double volume) {
        Iterator var3 = this.products.iterator();

        Product product;
        do {
            if (!var3.hasNext()) {
                return null;
            }

            product = (Product)var3.next();
        } while(!(product instanceof BottleOfWater) || ((BottleOfWater)product).getVolume() != volume);

        return (BottleOfWater)product;
    }
    public Snack getSnack(double size) {
        Iterator var3 = this.products.iterator();

        Product product;
        do {
            if (!var3.hasNext()) {
                return null;
            }

            product = (Product)var3.next();
        } while(!(product instanceof Snack) || ((Snack)product).getSize() != size);

        return (Snack) product;
    }
}
