import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ReferenceDataTypeTask {
    public static String text = "some text string goesqqqqqqqaqqqqqqqqqqqaaaaa here. test. Another string";

    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    private static void task1() {

        char[] textArray = text.toCharArray();
        String[] textParts = text.split("(?<=\\.)");
        String[] spaces = text.split(" ");

        System.out.println("First symbol: " + textArray[0]);
        System.out.println("Last symbol: " + textArray[textArray.length - 1]);
        System.out.println("Middle symbol: " + text.substring(text.length() / 2, text.length() - (text.length() / 2)));
        System.out.println("Text before point:" + textParts[0]);
        System.out.println("Spaces: " + (spaces.length - 1));
    }

    private static void task2() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String textString = scanner.nextLine();
        textString = textString.replace(scanner.nextLine(), scanner.nextLine());
        System.out.println("Result: " + textString);
    }

    private static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String textString = scanner.nextLine();
        List<String> splited = Arrays.asList(textString.split(" "));
        System.out.println(splited.stream().max(Comparator.comparingInt(String::length)));
    }
}
