package ensyu;

public class Q4 {
	public static void main(String[] args) {
		int x = new java.util.Random().nextInt(10) + 1;
		if ( x%2 == 0 ){
			System.out.println(x + "は偶数(even)");
		}
		else {
			System.out.println(x + "は奇数(odd)");
		}

	}

}
