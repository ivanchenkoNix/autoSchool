package section5;

import java.time.LocalDate;
import java.util.*;

public class SetAndMapTasks {
    private static Random random = new Random();

    public static void main(String[] args) {
//        task12();
//        task13();
//        task14();
//        task15();
//        task16();
        task17();
    }

    public static void task12() {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 20; i++)
            set.add("П" + getRandomString());

        for (String s : set)
            System.out.println(s);
    }

    public static void task13() {
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(getRandomInt(50));
        }
        numbers.removeIf(integer -> integer > 10);
        for (Integer integer : numbers)
            System.out.println(integer);
    }

    public static void task14() {
        Map<String, String> map = new HashMap<>();
        map.put("Vasya", "Bes");
        map.put("Andrey", "Bes");
        map.put("Kolya", "Adum");
        map.put("Serg", "Billy");
        map.put("Eugen", "Bes");
        map.put("Adnruha", "Dark");
        map.put("Some", "Dark");

        Map<String, Integer> map1 = new HashMap<>();

        map.forEach((key, value) -> {
            if (!map1.containsKey(value)) {
                map1.put(value, 1);
            } else {
                map1.put(value, map1.get(value) + 1);

            }
        });
        map1.forEach((s, integer) -> System.out.println(s + "\tentries\t" + integer));
    }

    public static void task15() {
        Map<String, LocalDate> map = new HashMap<>();
        map.put("Vasya", LocalDate.of(1993, 6, 12));
        map.put("Andrey", LocalDate.of(1995, 9, 29));
        map.put("Kolya", LocalDate.of(1997, 3, 13));
        map.put("Serg", LocalDate.of(1999, 5, 5));
        map.put("Eugen", LocalDate.of(2000, 2, 7));
        map.put("Adnruha", LocalDate.of(1988, 1, 25));
        map.put("Some", LocalDate.of(1978, 12, 11));

        Map<String, LocalDate> updated = new HashMap<>();

        map.forEach((key, value) -> {
            if (value.getMonthValue() > 8 | value.getMonthValue() < 6) {
                updated.put(key, value);
            }
        });

        updated.forEach(((s, localDate) -> System.out.println("Name " + s + " Date of birth " + localDate)));
    }

    public static void task16() {
        Map<String, String> map = new HashMap<>();
        map.put("Vasya", "Bes");
        map.put("Andrey", "Bes");
        map.put("Kolya", "Adum");
        map.put("Serg", "Billy");
        map.put("Eugen", "Bes");
        map.put("Adnruha", "Dark");
        map.put("Some", "Dark");

        Map<String, Integer> map1 = new HashMap<>();

        map.forEach((key, value) -> {
            if (!map1.containsKey(value)) {
                map1.put(value, 1);
            } else {
                map1.put(value, map1.get(value) + 1);
            }
        });
        map1.forEach((key, value) -> {
            if (value > 1) {
                while (map.values().remove(key)) ;
            }
        });

        map.forEach((key, value) -> System.out.println(key + "\t" + value));
    }

    public static void task17() {
        Map<String, String> map = new HashMap<>();
        map.put("Vasya", "Bes");
        map.put("Andrey", "Bes");
        map.put("Kolya", "Adum");
        map.put("Serg", "Billy");
        map.put("Eugen", "Bes");
        map.put("Adnruha", "Dark");
        map.put("Some", "Dark");
        map.put("Vasya", "Ivan");
        map.put("Serg", "Hood");

        map.forEach((key,value)-> System.out.println(key + "\t" + value));
    }

    static String getRandomString() {
        String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";

        char[] text = new char[10];
        for (int i = 0; i < 10; i++) {
            text[i] = string.charAt(random.nextInt(string.length()));
        }
        return new String(text);
    }

    public static int getRandomInt(int bound) {
        return random.nextInt(bound);
    }
}
