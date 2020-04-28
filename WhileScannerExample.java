import java.util.*;
public class WhileScannerExample {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scn = new Scanner(System.in); //사용자가 불러온 값을 읽음.
        while(true) {
                System.out.println("값[정수]을 입력하세요. ");
                int inputValue = scn.nextInt();
                if(inputValue > 0) {
                        sum = sum + inputValue;
                        System.out.println("현재까지 합 : " + sum);
                } else {
                    break;
                }    
            }   
            System.out.println("sum : " + sum);
            scn.close(); 
        }
    }
