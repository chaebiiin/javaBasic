
public class RemindExample {
	public static void main(String[] args) {
		byte b1, b2;
		b1 = 50;
		b2 = 70;
		int result = b1 + b2;
		System.out.println(" result  :  " + result);
		
		int n1 = 0;
		n1 = b1;
		b1 = (byte) n1;
		System.out.println("b1 :  " + b1 + ", n1  : " + n1);
	}
}
