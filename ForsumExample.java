
public class ForsumExample {
    public static void main(String[] args) {
       
        int sum = 0;  // 1~100까지 합을 구하는 프로그램
        for (int i=1; i<=100; i++) {
            if (i % 3 == 0) { //i를  3으로 나눈 나머지가 0 이면 3의 배수?? 3의 배수만 구하는 프로그램
                sum = sum + i;
            } 
        }
        System.out.println("1 ~ 100 3의 배수의 합 = " + sum); 
    }
}