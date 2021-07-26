package ensyu4;

public class Q09 {
	public static void main(String[] args) {
		System.out.println("台形の面積を求めます");
		System.out.println("上底を整数で入力してください");
		int upper = new java.util.Scanner(System.in).nextInt();
		System.out.println("下底を整数で入力してください");
		int bottom = new java.util.Scanner(System.in).nextInt();
		System.out.println("高さを入力してください");
		int height = new java.util.Scanner(System.in).nextInt();
		int result = ShapeLogic.trapezoid(upper,bottom,height);
		System.out.println("上底が" + upper + "、下底が" + bottom +"、高さが" + height + "の、台形の面積は" + result);
	}
}
