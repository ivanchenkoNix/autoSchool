package figur;

public class Square extends Figur {

    private double height;

    private double width;

    Square(int x, int y, String name, double height, double width) {
        super(x, y, name);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }
}
