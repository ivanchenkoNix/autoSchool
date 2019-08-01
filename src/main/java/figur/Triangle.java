package figur;

public class Triangle extends Figur {

    Triangle(int x, int y, String name, double base, double height) {
        super(x, y, name);
        this.base = base;
        this.height = height;
    }

    private double base;

    private double height;


    @Override
    public double area() {
        return 0.5 * base * height;
    }
}
