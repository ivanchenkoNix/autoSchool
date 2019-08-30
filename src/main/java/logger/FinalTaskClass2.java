package logger;

import java.util.Random;

public class FinalTaskClass2 {

    public static void main(String[] args) throws InterruptedException {

        try {
            max(initializeArray());
        }
        catch (ArithmeticException a){
            System.out.println(a.getMessage() + " is changed to You shall not fall!");
        }
    }

    private static void max(int[] array)  {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        System.out.println("Max number is: " + max);
    }

    private static int[] initializeArray() throws InterruptedException {
        Random random = new Random();
        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(30);
                int zero = 5 / 0;
                Thread.sleep(300);
        }

        return numbers;
    }
}

