public class RemindScope  {
	public static void main(String[] args ) {
		int s1 = 15;
	    if(s1>10) {
		int s2 = s1 - 10;
		int s3 = s1 + s2 + 5;
		int result = s1 + s2 + s3;
		System.out.println(s1 + s2 + s3);
	} else {
		System.out.println("mistake");	}
		
	}	
}