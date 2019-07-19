package arrayTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ArraysTask {

    public static void main(String[] args) throws IOException {
        max(initializeArray());

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
}
