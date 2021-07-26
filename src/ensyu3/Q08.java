package ensyu3;

public class Q08 {
	public static void taxCalc(int value) {
		int taxValue = (int) (value * 1.08);
		System.out.println(value + "は消費税込みで" + taxValue + "円です");
	}

	public static void main(String[] args) {
		System.out.println("価格を入力してください>");
		int value = new java.util.Scanner(System.in).nextInt();
		taxCalc(value);
	}

}
