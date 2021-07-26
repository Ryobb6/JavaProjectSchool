package ensyu4;

public class Q07 {
	public static void main(String[] args) {
		System.out.println("四角形の面積を求めます");
		System.out.println("縦の長さを整数で入力してください");
		int tall = new java.util.Scanner(System.in).nextInt();
		System.out.println("横の長さを整数で入力してください");
		int wide = new java.util.Scanner(System.in).nextInt();
		int result = ShapeLogic.square(tall, wide);
		System.out.println("縦が" + tall + "横が" + wide +" 面積は" + result);
	}
}
