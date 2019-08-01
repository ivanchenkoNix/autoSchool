package figur;

public class Circle extends Figur {

    Circle(int x, int y, String name, double radius) {
        super(x, y, name);
        this.radius = radius;
    }

    private double radius;


    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
