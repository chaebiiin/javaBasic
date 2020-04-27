import javax.sound.sampled.SourceDataLine;

import sun.net.www.content.text.plain;

public class CharOperationExample {
    public static void main(String[] args) {
        int v1 = 5;
        int v2 = 2;

        int result = v1 / v2;
        double result1 = (double) v1 / v2;
        System.out.println("두 수의 나눈 몫 :  " + result1);

        result = sum(10, 15);
        System.out.println("두 수의 합 :  " + result);
        result = minus(5, 20);
        System.out.println("두 수의 차이는 :  " + result);
        double result2 = divide(15, 2);
        System.out.println("두 수의 나눈 몫 =  " + result2);
    } // end of main

    public static int sum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    } // end of sum()

    public static int minus(int num3, int num4) {
        int result = num3 - num4;
        return result;
     } // end of minus()
     
    public static double divide(int num5, int num6) {
        double result = (double) num5 / num6;
        return result;
    }
        

}