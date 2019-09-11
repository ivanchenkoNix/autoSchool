import java.util.Scanner;

public class SimpleDataTypesTask {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        printHelloName();

    }

    static void printHelloName() {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Hello, " + username);
    }
}
