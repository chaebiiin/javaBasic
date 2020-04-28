
public class WhilExample {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }
        // while 구문사용.
        int i = 1;
        sum = 0;
        while (i <= 5) {
            sum = sum + i;
            i++;
        }
        System.out.println("sum1 : " + sum);
        i = 1;
        sum = 0;
        while (true) {
            if (i > 5) {
                break;
            }
            sum = sum + i;
            i++;
        }
        System.out.println("sum2 : " + sum);

        // 1~100 중에 홀수만 더하는
        sum = 0;
        i = 1;
        while (true) {
            if (i > 100) {
                break;
            }
            if (i % 3 == 0) {
                sum = sum + i;
            }
            i++;

        }
        System.out.println("sum3 : " + sum);
    }
}