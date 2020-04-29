
public class EvenSumExample {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++) {
           // 2 또는 3의 배수 출력 조건 조건 A || 조건 B
           if ((i % 2 == 0) || (i % 3 == 0)) {
            System.out.println("2 또는 3의 배수 :  " + i); // AND
           }
        if ((i % 2 == 0) && (i % 3 == 0)) {
            System.out.println("2 와 3의 배수:  " + i); // OR 2와 3의 공통 배수.
        }
        if( !(i%2==0)) { // <-홀수
            System.out.println("홀수 값 : " + i);
        }
    }
  }
}