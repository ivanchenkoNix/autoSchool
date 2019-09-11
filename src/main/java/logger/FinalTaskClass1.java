package logger;

import java.util.Random;

public class FinalTaskClass1 {

    public static void main(String[] args) {


        max(initializeArray());
    }

    private static void max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        System.out.println("Max number is: " + max);
    }

    private static int[] initializeArray() {
        Random random = new Random();
        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(30);
            try {
                int zero = 5 / 0;
                Thread.sleep(300);
            } catch (Exception e) {
                System.out.println("You shall not fall");
            }
        }

        return numbers;
    }
}
