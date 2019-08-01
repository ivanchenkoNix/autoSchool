package figur;

import java.util.Random;

class RandomsHelper {

    private Random random = new Random();

    int getRandomInt(int bound) {
        return random.nextInt(bound);
    }

    double getRandomDouble(int rangeMin, int rangeMax) {
        return rangeMin + (rangeMax - rangeMin) * random.nextDouble();
    }

    String getRandomString() {
        String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";

        char[] text = new char[10];
        for (int i = 0; i < 10; i++) {
            text[i] = string.charAt(random.nextInt(string.length()));
        }
        return new String(text);
    }
}
