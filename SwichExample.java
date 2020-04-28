
public class SwichExample {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1; // 1부터 시작해서 7보다 작음. (1 <= num < 7)
        switch (num) {
            case 1:
                System.out.println("1번이 나왔습니다. ");
                break; //한 번만 실행하고 멈추려면 꼭 입력해줘야함.
            case 2:
                System.out.println("2번이 나왔습니다. ");
                break;
            case 3:
                System.out.println("3번이 나왔습니다. ");
                break;
            case 4:
                System.out.println("4번이 나왔습니다. ");
                break;
            case 5:
                System.out.println("5번이 나왔습니다. ");
                break;
            default:
                System.out.println("6번이 나왔습니다. ");
        }
        System.out.println("...end of program...");
    }
}