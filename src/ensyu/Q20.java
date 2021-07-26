package ensyu;

public class Q20 {
	public static void main(String[] args) {
		int num1 = new java.util.Random().nextInt(21);
		int num2 = new java.util.Random().nextInt(21);
		if (num1 > num2){
			System.out.println("num1:" + num1 + "とnum2:" + num2 +"の差は" + (num1 - num2) +"です");
		}else if(num1 < num2){
			System.out.println("num2:" + num2 + "とnum1:" + num1 +"の差は" + (num2- num1) +"です");
		}
		else{
				System.out.println("num1:" + num1 + "とnum2:" + num2 +"は等しいです");
		}
	}
}
