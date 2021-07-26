package ensyu3;

public class Q09 {
	public static int avrgCalc(int m, int n) {
		int avrg = (m+n)/2;
		return avrg;
	}
	public static void main(String[] args) {
		System.out.println("整数1を入れてください。>");
		int m = new java.util.Scanner(System.in).nextInt();
		System.out.println("整数2を入れてください。>");
		int n = new java.util.Scanner(System.in).nextInt();
		System.out.println("2つの整数値の平均は" + avrgCalc(m,n) + "です");
	}

}
