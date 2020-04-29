
public class MethodExample2 {
    public static void main(String[] args) {
        printDouble(10, 5);
        printString("Hello", "Hong");
        printStar(3, "hello");
        printGugudan(9);
        printTriangle(5);
    }
    public static void printTriangle(int a) {
        for (int i=0; i<a; i++) {
            for (int j=0; j<=i; j++){   
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    public static void printGugudan(int dan) {
        for (int i = 1; i <= 9; i++)    {
           // System.out.println(dan + "X" + i + "=" + (dan*i));
        }

    }
    public static void printString(String str, String name) {
       // System.out.println(str + ", " + name);
    }

    public static void printDouble(int a, int b) {
        // System.out.println("결과 값은 = " + a * b);
    }

    public static void printStar(int a, String str) {
        for (int j = 0; j<a; j++) {
          //   System.out.println(str);
        }
    }

    public static void printStar(int a, int b) {
        for (int j = a; j <= b; j++) {
            // System.out.println("*****");
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