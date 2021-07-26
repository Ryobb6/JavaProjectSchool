package ensyu4;

public class Q03 {
	public static void main(String[] args) {
		System.out.println("整数を一つ入力して下さい");
		int m = new java.util.Scanner(System.in).nextInt();
		if(Calculation.evenNumberJudge(m)){
			System.out.println("「偶数です」");
		}else{
			System.out.println("「奇数です」");
		}
	}
}
