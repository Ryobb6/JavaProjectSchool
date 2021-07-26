package ensyu3;

public class Q05 {
	public static int sum(int num) {
		int sum = 0;
		for (int i = 1 ; i <= num ; i++){
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("1からいくつまで足しますか>");
		int n = new java.util.Scanner(System.in).nextInt();
		System.out.println("1から" + n + "までの和は" + sum(n) + "です。");
	}

}
