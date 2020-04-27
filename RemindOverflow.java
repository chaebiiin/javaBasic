
public class RemindOverflow {
    public static void main(String[] args) {
        int x = 1000000;
        long y = 1000000L;
        long z = x * y;
        System.out.println(z);

        long a = 1000000;
        long b = 1000000;
        long c = a * b;
        System.out.println(c);
    }
}