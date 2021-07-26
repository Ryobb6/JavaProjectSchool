package ensyu;

public class Q24 {
	public static void main(String[] args) {
		int tmp = 0;
		System.out.println("xに代入する数値をいれてください。>");
		int x = new java.util.Scanner(System.in).nextInt();
		System.out.println("yに代入する数値をいれてください。>");
		int y = new java.util.Scanner(System.in).nextInt();
		tmp = y;
		y = x;
		x = tmp;
		System.out.println("２つの数値を入れ替えました。x:" + x + ",y:" + y);
	}
}
