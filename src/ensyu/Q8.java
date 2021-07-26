package ensyu;

public class Q8 {
	public static void main(String[] args) {
		int n = new java.util.Random().nextInt(101);
		System.out.println("Score:" + n);
		if ( n >= 80){
			System.out.println("Excellent！");
		} else if ( n >= 50) {
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}
	}

}
