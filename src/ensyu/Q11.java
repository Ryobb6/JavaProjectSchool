package ensyu;

public class Q11 {
	public static void main(String[] args) {
		System.out.println("10月は英語で何?>");
		String october = new java.util.Scanner(System.in).nextLine();
		if ( october.equals("October")){
			System.out.println("OK!");
		}else{
			System.out.println("NG");
		}
	}

}
