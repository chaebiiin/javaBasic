
public class ForRemind {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<=10; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                continue;
            } else {
                System.out.println(i + "는 홀수 입니다.");
            }
                System.out.println(i);
        }
        System.out.println("sum : " + sum);
    }
}
//1~100까지의 숫자중에서 2의 홀수를 출력하고, 짝수는 else를 사용하여 출력하시오.
//1~100까지의 숫자 중 짝수 값은 출력하지 않고, 짝수들을 더한 값만 구하시오