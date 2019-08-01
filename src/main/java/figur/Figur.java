package figur;

public abstract class Figur {

    public Figur(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = getClass().getName() + "-" + name;
    }

    private int x;

    private int y;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void coordinates() {
        System.out.println(String.format("Figure coordinates: x:%d y:%d", x, y));
    }

    public abstract double area();

    @Override
    public String toString() {
        return "Figur {" +
                "x=" + x +
                ", y=" + y +
                ", name='" + name + '\'' +
                '}';
    }
}
