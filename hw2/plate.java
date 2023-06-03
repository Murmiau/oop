package hw1.hw2;

public class plate {
    int food;

    public plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Осталось корма в тарелке: " + food + " грамм");
    }

    public void getFood(int n) {
        food -= n;
    }

    public void setFood(int m) {
        food += m;
    }
}