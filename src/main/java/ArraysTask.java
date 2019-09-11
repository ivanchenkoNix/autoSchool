import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ArraysTask {

    public static void main(String[] args) throws IOException {
        max(initializeArray());
        task2();
        task3();
        task4();
        task5();

    }

    private static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter " + (i + 1) + " number");
            String s = reader.readLine();
            numbers[i] = Integer.parseInt(s);
        }
        return numbers;
    }

    private static void max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        System.out.println("Max number is: " + max);
    }

    private static void task2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] list = new String[10];
        for (int j = 0; j < list.length - 2; j++) {
            System.out.println("Enter string: " + j);
            list[j] = reader.readLine();
        }

        for (int i = list.length - 1; i >= 0; i--) {
            System.out.println("Array list element number " + i + " is: " + list[i]);
        }
    }

    private static void task3() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] list = new String[10];
        Integer[] length = new Integer[10];

        for (int j = 0; j < list.length; j++) {
            System.out.println("Enter string: " + j);
            list[j] = reader.readLine();
            length[j] = list[j].length();
        }

        for (Integer integer : length) {
            System.out.println("String lenght " + integer);
        }
    }

    private static void task4() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer[] numbers = new Integer[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter " + (i + 1) + " number");
            String s = reader.readLine();
            numbers[i] = Integer.parseInt(s);
        }

        for (int i = 0; i < numbers.length / 2; i++) {
            int buffer = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = buffer;
        }

        for (Integer integer : numbers) {
            System.out.println(integer);
        }
    }

    private static void task5() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer[] large = new Integer[20];
        Integer[] small1 = new Integer[10];
        Integer[] small2 = new Integer[10];

        for (int i = 0; i < large.length; i++) {
            System.out.println("Enter " + (i + 1) + " number");
            String s = reader.readLine();
            large[i] = Integer.parseInt(s);
        }

        for (int i = 0; i < small1.length; i++) {
            small1[i] = large[i];
            small2[i] = large[i + large.length / 2];
        }
        for (Integer integer : small2) {
            System.out.println(integer);
        }

    }
}
