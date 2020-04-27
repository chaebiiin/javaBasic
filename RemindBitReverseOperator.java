
public class RemindBitReverseOperator {
    public static void main(String[] args) {
        int v4 = -10;
        int v5 = ~v4;
        int v6 = ~v4 + 1;
        System.out.println(toBinaryString(v4) + " (십진수)");
        System.out.println(toBinaryString(v5)  + " (십진수)");
        System.out.println(toBinaryString(v6) + " (십진수)");
       

    }

        public static String toBinaryString(int value) {
            String str = Integer.toBinaryString(value);
            while(str.length() < 32) {
                str = "0" + str;
            }
            return str;
        }
}