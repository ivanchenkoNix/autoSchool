public class TypeConversion {

    public static void main(String args[]) {
       task1();
       task2();
       task3();
    }

    private static void task1() {
        int q = 21;
        int c = 8;
        System.out.println(q/c%10+ " ostatok "+ q%c);
    }

    private static void task2() {
        int n = 49;
        System.out.println(n+=n);
    }

    private static void task3() {
       double n = 32.13;
       System.out.println(Math.round(n));
    }

    private static void task4() {
        int a = 0;
        int b = 2;
        int c = 5;

    }
}
