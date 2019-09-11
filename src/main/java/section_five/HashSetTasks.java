package section_five;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;

public class HashSetTasks {

    private static Random random = new Random();

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4and5();
        task6();
    }


    public static void task1() {

        HashSet<String> set = new HashSet<>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("жень-шен");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        for (String s : set) {
            System.out.println(s);
        }
    }

    public static void task2() {
        HashMap<String, String> map = new HashMap<>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for (Map.Entry<String, String> hashMap : map.entrySet()) {
            System.out.println(hashMap.getKey() + " - " + hashMap.getValue());
        }
    }

    public static void task3() {

        HashMap<String, Cat> catHashMap = new HashMap<>();
        Cat cat1 = new Cat("Vasya");
        Cat cat2 = new Cat("bob");
        Cat cat3 = new Cat("Alex");
        Cat cat4 = new Cat("Abdul");
        Cat cat5 = new Cat("Yenifer");

        catHashMap.put(cat1.getName(), cat1);
        catHashMap.put(cat2.getName(), cat2);
        catHashMap.put(cat3.getName(), cat3);
        catHashMap.put(cat4.getName(), cat4);
        catHashMap.put(cat5.getName(), cat5);

        for (Map.Entry<String, Cat> map : catHashMap.entrySet()) {
            System.out.println(String.format("Name %s of object %s", map.getKey(), map.getValue()));
        }

    }

    public static void task4and5() {

        HashMap<String, String> hashMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            hashMap.put(getRandomString(), getRandomString());
        }

        for (Map.Entry<String, String> map : hashMap.entrySet()) {
            System.out.println("Key\t" + map.getKey() + "\tValue\t" + map.getValue());
        }
    }

    public static void task6() {
        HashMap<String, Cat> catHashMap = new HashMap<>();

        Cat cat1 = new Cat("Vasya", 12);
        Cat cat2 = new Cat("bob", 5);
        Cat cat3 = new Cat("Alex", 3);
        Cat cat4 = new Cat("Abdul", 11);
        Cat cat5 = new Cat("Yenifer", 14);

        catHashMap.put(cat1.getName(), cat1);
        catHashMap.put(cat2.getName(), cat2);
        catHashMap.put(cat3.getName(), cat3);
        catHashMap.put(cat4.getName(), cat4);
        catHashMap.put(cat5.getName(), cat5);

        for (Map.Entry<String, Cat> map : catHashMap.entrySet()) {
            System.out.println(String.format("key is %s and age is %d ", map.getKey(), map.getValue().getAge()));

        }
    }

    static String getRandomString() {
        String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";

        char[] text = new char[10];
        for (int i = 0; i < 10; i++) {
            text[i] = string.charAt(random.nextInt(string.length()));
        }
        return new String(text);
    }
}
