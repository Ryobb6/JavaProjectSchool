package chapter14;

public class Code14_1 {
	public static void main(String[] args) {
		Empty e = new Empty();
		System.out.println(e.toString());
		System.out.println(e);
		int m = e.hashCode();
		System.out.println(m);
		"abc".equals("abd");
	}
}
