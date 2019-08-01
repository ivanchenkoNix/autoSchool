package figur;

public class Square extends Figur {

    Square(int x, int y, String name, double height, double width) {
        super(x, y, name);
        this.height = height;
        this.width = width;
    }

    private double height;

    private double width;

    @Override
    public double area() {
        return height * width;
    }
}
