package ensyu4;

public class Q04 {
	public static void main(String[] args) {
		System.out.println("1から100までの整数を１つ入力してください");
		int m = new java.util.Scanner(System.in).nextInt();
		if(Calculation.findNumber(m)){
			System.out.println("「見つかりました」");
		}else{
			System.out.println("「見つかりませんでした」");
		}
	}

}
