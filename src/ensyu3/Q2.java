package ensyu3;

public class Q2 {
	public static void hello(String name, int age) {
		System.out.println(name+ "(" + age + ")さん、こんにちは!");
	}

	public static void main(String[] args) {
		System.out.println("お名前を入力してください>");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("年齢をいれてください>");
		int age = new java.util.Scanner(System.in).nextInt();
		hello(name,age);
	}
}
