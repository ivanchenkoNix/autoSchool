import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ReferenceDataTypeTask {
    public static final String TEXT = "some TEXT string goesqqqqqqqaqqqqqqqqqqqaaaaa here. test. Another string";

    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    private static void task1() {

        char[] textArray = TEXT.toCharArray();
        String[] textParts = TEXT.split("(?<=\\.)");
        String[] spaces = TEXT.split(" ");

        System.out.println("First symbol: " + textArray[0]);
        System.out.println("Last symbol: " + textArray[textArray.length - 1]);
        System.out.println("Middle symbol: " + TEXT.substring(TEXT.length() / 2, TEXT.length() - (TEXT.length() / 2)));
        System.out.println("Text before point:" + textParts[0]);
        System.out.println("Spaces: " + (spaces.length - 1));
    }

    private static void task2() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter TEXT");
        String textString = scanner.nextLine();
        textString = textString.replace(scanner.nextLine(), scanner.nextLine());
        System.out.println("Result: " + textString);
    }

    private static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter TEXT");
        String textString = scanner.nextLine();
        List<String> splited = Arrays.asList(textString.split(" "));
        System.out.println(splited.stream().max(Comparator.comparingInt(String::length)));
    }
}
