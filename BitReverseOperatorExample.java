
public class BitReverseOperatorExample {
		public static void main(String[] args) {
			int num1 = 10;
			int num2 = ~num1;
			int num3 = num2 + 1;
			//java2 conflict..
			
			String returnValue = toBinaryString(num1);
			System.out.println(returnValue);
		
			String returnValue1 = toBinaryString(num2);
			System.out.println(returnValue1);
			
			String returnValue2 = toBinaryString(num3);
			System.out.println(returnValue2);
		}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() <32) {
			str = "0" + str;
		}
	
		return str;
	}
}	
