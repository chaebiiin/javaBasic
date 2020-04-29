
public class MethodExample1 {
    public static void main(String[] args) {
        int result = sum(10, 15, 20);
        // System.out.println("result : " + sum(10, 15));
        // System.out.println("result : " + sum(10.5, 15.4));
        // System.out.println("result : " + sum(10, 15, 20));
        // System.out.println("1~ 5까지의 합" + toSum(1, 5)); // 1~5까지의 합 구하기.
        printStar(1, 10);
        System.out.println("=========");
        printStar(3);
    }
    public static void printStar(int a) {
        for (int j = 1; j <= a; j++) {
            //System.out.println("*****");
        }
    }
    public static void printStar(int a, int b) {
    
        for (int j = a; j <= b; j++) {
            System.out.println("*****");
        }
    }

    public static int toSum(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i; // sum = sum +i;
        }
        return sum;
    }

    public static int sum(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }

    public static double sum(double d, double e) {
        double sum = 0;
        sum = d + e;
        return sum;
    }

    public static int sum(int a, int b, int c) {
        int sum = 0;
        sum = a + b + c;
        return sum;
    }
}