package section5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class ArrayListTasks {

    private static Random random = new Random();

    public static void main(String[] args) throws Exception {
//        task7();
//        task8();
//        task9();
//        task10();
        task11();
    }

    public static void task7() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(getRandomString());
        }
        System.out.println("List size is: " + list.size());
        for (String value : list) {
            System.out.println(value);
        }
    }

    public static void task8() throws Exception {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(enterString());
        }
        ArrayList<String> longest = new ArrayList<>();
        int maxlength = 0;
        for (int i = 0; i < 5; i++) {
            if (list.get(i).length() > maxlength) {
                longest.clear();
                maxlength = list.get(i).length();
                longest.add(list.get(i));
            } else if (list.get(i).length() == maxlength) {
                maxlength = list.get(i).length();
                longest.add(list.get(i));
            }
        }
        for (String s : longest) {
            System.out.println(s);
        }
    }

    public static void task9() throws Exception {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(enterString());
        }
        ArrayList<String> shortest = new ArrayList<>();
        int minlength = list.get(0).length();
        for (int i = 0; i < 5; i++) {
            if (list.get(i).length() < minlength) {
                shortest.clear();
                minlength = list.get(i).length();
                shortest.add(list.get(i));
            } else if (list.get(i).length() == minlength) {
                minlength = list.get(i).length();
                shortest.add(list.get(i));
            }
        }
        for (String s : shortest) {
            System.out.println(s);
        }
    }

    public static void task10() throws Exception {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(0, enterString());
        }

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void task11() throws Exception {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(enterString());
        }
        for (int i= 0; i < 13; i++) {
            list.add(0,list.get(list.size()-1));
            list.remove(list.size()-1);
        }

        for (String s : list) {
            System.out.println(s);
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


    private static String enterString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}
