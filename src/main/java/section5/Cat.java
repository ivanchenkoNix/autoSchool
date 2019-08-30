package section5;

public class Cat {

    Cat(String name) {
        this.name = name;
    }

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;

    private int age;

    String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
