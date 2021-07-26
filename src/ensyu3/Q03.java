package ensyu3;

public class Q03 {
	public static int calc(int num) {
		num = num*num*num;
		return num;
	}

	public static void main(String[] args) {
		System.out.println("整数を入れてください。>");
		int num = new java.util.Scanner(System.in).nextInt();
		System.out.println(num + "を３乗すると" + calc(num) + "です。");

	}

}
