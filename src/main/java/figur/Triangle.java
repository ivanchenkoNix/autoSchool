package figur;

public class Triangle extends Figur {

    private double base;

    private double height;

    Triangle(int x, int y, String name, double base, double height) {
        super(x, y, name);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}
