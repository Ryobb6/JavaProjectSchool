package ensyu4;

public class Q05 {
	public static void main(String[] args) {
		System.out.println("配列の要素数を入力して下さい");
		int m = new java.util.Scanner(System.in).nextInt();
		int[] array = Calculation.arrayGeneration(m);
		System.out.println("配列の中身は・・・");
		for (int value : array){
			System.out.println(value);
		}
	}

}
