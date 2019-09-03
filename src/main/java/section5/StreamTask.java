package section5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamTask {

    private static Random random = new Random();

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 50; i++)
            list.add(getRandomString());
        list.add("");
        list.add("");

        list.stream().filter(entry -> entry.length() != 0 & !entry.contains("d")).sorted().forEach((entry)
                -> System.out.println(String.format("%s length %d", entry, entry.length())));
    }

    static String getRandomString() {
        String string = "abcdefghijklmnopqrstuvwxyz1234567890";
        int random1 = getRandomInt(40);
        char[] text = new char[random1];
        for (int i = 0; i < random1; i++) {
            text[i] = string.charAt(random.nextInt(string.length()));
        }
        return new String(text);
    }

    static int getRandomInt(int bound) {
        return random.nextInt(bound);
    }
}
