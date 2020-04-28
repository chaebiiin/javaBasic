
public class IfExample { //p.115
    public static void main(String[] args) {
        int score = 75;
        // score = 80;
        if (score >= 90) {
            if (score >= 95) { //if 안에 또 if를 넣어 세부 조건을 넣을 수 있음.
                System.out.println("A+ 입니다. ");
            } else {
                System.out.println("A 입니다. ");
            }
        } else if (score >= 80) {
            if (score >= 85) {
                System.out.println("B+ 입니다.");
            } else {
                System.out.println("B 입니다. ");
            }
        } else if (score >= 70) {
            if (score >= 75) {
                System.out.println("C+ 입니다.");
            } else {
                System.out.println("C 입니다. ");
        }
        System.out.println("end of program."); // < 프로그램이 끝난 부분
        }
    }
}