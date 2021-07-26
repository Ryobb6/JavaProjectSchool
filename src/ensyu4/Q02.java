package ensyu4;

public class Q02 {
	public static void main(String[] args) {
		System.out.println("１つめの整数を入力して下さい");
		int m = new java.util.Scanner(System.in).nextInt();
		System.out.println("２つめの整数を入力して下さい");
		int n = new java.util.Scanner(System.in).nextInt();
		int l = Calculation.hiku(m,n);
		System.out.println(m + " - " + n + " = " + l);

	}

}
