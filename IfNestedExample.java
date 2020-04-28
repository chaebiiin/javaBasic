
public class IfNestedExample { // p.116
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6) + 1;  // Math.random() => 0 < 임의의 수 < 1 (0부터 시작해 크지만 6보다는 작은 수)
        
        if (num == 1) {
            System.out.println("번호 1번이 나왔습니다.");
        } else if (num == 2) {
            System.out.println("번호 2번이 나왔습니다.");
        } else if (num == 3) {
            System.out.println("번호 3번이 나왔습니다."); 
        } else if (num == 4) {
            System.out.println("번호 4번이 나왔습니다.");
        } else if (num == 5) {
            System.out.println("번호 5번이 나왔습니다.");
        } else {
            System.out.println("번호 6번이 나왔습니다.");
        }

        System.out.println("end of program."); // < 프로그램이 끝난 부분
    }
}   // 조건이 여러개 일 때, else if를 사용하여, 범위에 맞는 조건만 출력 해 낼 수 있음.