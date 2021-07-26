package ensyu;

public class Q9 {
	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < 5; i++){
			int n = new java.util.Random().nextInt(10);
			sum += n;
		}
		avg = sum / 5.0;
		System.out.println("5個の数値の合計は" + sum + "平均は" + avg);
	}

}
