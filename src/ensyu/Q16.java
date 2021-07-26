package ensyu;

public class Q16 {
	public static void main(String[] args) {
		int n = 0;
		int count = 0;
		do{
			n = new java.util.Random().nextInt(101);
			count++;
		}while (n != 100) ;
		System.out.println(count + "回めに100が出ました！");
	}
}
