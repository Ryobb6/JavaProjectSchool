package ensyu;

public class Q21 {
	public static void main(String[] args) {
		int n = 0;
		int count = 0;
		while(n != 777){
		n = new java.util.Random().nextInt(1000);
		count++;
		}
		System.out.println("777は" + count + "回目に出ました。");
	}
}
