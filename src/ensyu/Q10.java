package ensyu;

public class Q10 {
	public static void main(String[] args) {
		int count = 0;
		for ( int i = 0; i < 10; i++){
			int n = new java.util.Random().nextInt(101);
			if(n >= 50){
				count++;
			}
		}
		System.out.println("50以上のscoreは" + count + "個ありました。");
	}
}
