
public class ForExample {
    public static void main(String[] args) {
        int sum = 0;
        sum = sum + 1; // 1
        sum = sum + 2; // 3
        sum = sum + 3; // 6
        sum = sum + 4; // 10
        sum = sum + 5; // 15
        sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i; // 16 -18 - 21 - 25 - 30
            System.out.println(sum + " , " + i);
        }
        System.out.println("sum :  " + sum);
        
        int var1 = 3;
        for (int i = 1; i <= 9; i++) {
            System.out.println(var1 + " *  " + i + " = " + (var1 * i));
        }
    }
}