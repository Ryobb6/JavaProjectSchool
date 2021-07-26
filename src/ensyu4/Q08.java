package ensyu4;

public class Q08 {
	public static void main(String[] args) {
		System.out.println("三角形の面積を求めます");
		System.out.println("底辺を整数で入力してください");
		int bottom = new java.util.Scanner(System.in).nextInt();
		System.out.println("高さを整数で入力してください");
		int tall = new java.util.Scanner(System.in).nextInt();
		int result = ShapeLogic.triangle(bottom, tall);
		System.out.println("底辺が" + bottom + "高さが" + tall + "の三角形の面積は" + result);
	}

}
