import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class ConditionalExpressionsTasks {
    public static void main(String[] args) throws Exception {
//        task1(enterNumber(), enterNumber());
//        task2(enterNumber(),enterNumber(),enterNumber(),enterNumber());
//        task3(5);
//        task4(enterString(),enterString());
//        task5(enterString(), enterNumber());
//        task6(enterString(), enterNumber());.
//        task7();
//        task8();
//        task9();
//        task10(enterString(),enterNumber());
//        task11();
        task12();

    }

    private static void task1(int a, int b) {

        if (a < b) {
            System.out.println(a + " is the lowest number");
        } else
            System.out.println(b + " is the lowest number");

    }

    private static void task2(int a, int b, int c, int d) {
        if (a > b && a > c && a > d)

            System.out.println("a – это максимум");

        else if (b > a && b > c && b > d)

            System.out.println("b – это максимум");

        else if (c > a && c > b && c > d)

            System.out.println("c – это максимум");

        else if (d > a && d > b && d > c)

            System.out.println("d – это максимум");

    }

    private static void task3(int arraylength) throws Exception {
        Integer[] numbers = new Integer[arraylength];
        Integer[] sorted = new Integer[arraylength];
        for (int i = 0; i < arraylength; i++) {
            numbers[i] = enterNumber();
        }

        int buffer = numbers[0];
        int index = 0;
        for (int j = 0; j < sorted.length; j++) {
            for (int i = 0; i < numbers.length; i++) {
                if (buffer < numbers[i]) {
                    buffer = numbers[i];
                    index = i;
                }
            }
            numbers[index] = 0;
            sorted[j] = buffer;
            buffer = 0;
        }

        for (Integer integer : sorted) {
            System.out.println(integer);
        }
    }

    private static void task4(String a, String b) {
        if (a.equals(b))
            System.out.println("Имена идентичны");
        if (a.length() == b.length())
            System.out.println("Длины имен равны");
    }

    private static void task5(String name, int age) {
        if (age < 18)
            System.out.println(name + " Подрасти еще");
    }

    private static void task6(String name, int age) {
        if (age > 20)
            System.out.println(name + " И 18-ти достаточно");
    }


    private static void alternativeTask2(int arrayLength) throws Exception {
        Integer[] intarray = new Integer[arrayLength];
        for (int i = 0; i < arrayLength; i++)
            intarray[i] = enterNumber();
        System.out.println(Arrays.stream(intarray).max(Integer::compare).get() + "это макимум ");
    }

    private static void task7() throws Exception {
        int select = randomNumber();
        int userNumber = 0;
        for (int i = 0; i < 7; i++) {
            userNumber = enterNumber();
            if (select > userNumber)
                System.out.println("Мало");
            else if (select < userNumber)
                System.out.println("Много");
            else {
                System.out.println("Угадал :)");
                break;
            }
        }
        if (select != userNumber)
            System.out.println("Не угадал :(");
    }

    private static void task8() {
        int count = 1;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }
    }

    private static void task9() {
        int count = 10;
        while (count >= 1) {
            System.out.println(count);
            count--;
        }
    }

    private static void task10(String string, int number) {
        int repeats = 0;
        while (repeats != number) {
            System.out.println(string);
            repeats++;
        }
    }

    private static void task11() {
        int x = 0;
        int y = 0;
        while (y != 10) {
            System.out.println("");
            while (x != 10) {
                System.out.print("S");
                x++;
            }
            x = 0;
            y++;
        }
    }

    private static void task12() {
        int number = 1;
        int multiplier = 1;
        while (number <= 10){
            while (multiplier <= 10) {
                System.out.print(number * multiplier+"\t");
                multiplier++;
            }
            System.out.print("\n");
            number++;
            multiplier=1;
        }
    }


    private static int randomNumber() {
        Random random = new Random();
        return random.nextInt(20 + 1);
    }


    private static int enterNumber() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    private static String enterString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}
