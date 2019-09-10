package figur;

public abstract class Figur {

    private int x;

    private int y;

    public Figur(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = getClass().getName() + "-" + name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public abstract double area();

    public void setName(String name) {
        this.name = name;
    }

    public void coordinates() {
        System.out.println(String.format("Figure coordinates: x:%d y:%d", x, y));
    }

    @Override
    public String toString() {
        return "Figur {" +
                "x=" + x +
                ", y=" + y +
                ", name='" + name + '\'' +
                '}';
    }
}
