package ensyu2;

public class Q7 {
	public static void main(String[] args) {
		System.out.println("何人?");
		int n = new java.util.Scanner(System.in).nextInt();
		int [] nums = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++){
			System.out.println((i+1) + "人目の点数を入力してください");
			nums[i] = new java.util.Scanner(System.in).nextInt();
			sum += nums[i];
		}
		System.out.println("合計点数は"+ sum +"点です。");
	}
}
