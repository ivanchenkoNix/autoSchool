public class TypeConversion {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        int q = 21;
        int c = 8;
        System.out.println(q / c % 10 + " ostatok " + q % c);
    }

    private static void task2() {
        int n = 49;
        System.out.println(n/10%10 + n%10);
    }

    private static void task3() {
        double n = 32.13;
        System.out.println((int)(n+0.5));
    }

    private static void task4() {
        int a = 0;
        int b = 2;
        int c = 5;

        int a2 = a + b;
        int b2 = c - a;
        int c2 = a + b + c;

        a = a2;
        b = b2;
        c = c2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
