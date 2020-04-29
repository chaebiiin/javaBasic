
public class ForAndForExample {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + " 단  ");
            for (int j = 1; j <= 9; j++) {
                //2 * 1 = 2
                System.out.println(i + " * " + j + " = " +(i * j) );
            }
        }
    }
}