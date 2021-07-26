package ensyu2;

public class Q5 {
	public static void main(String[] args) {
		boolean [] result = {true,false,false,true,true} ;
		System.out.println("第何戦の結果を調べますか(1~5)");
		int n = new java.util.Scanner(System.in).nextInt();
		if (result [n-1] == true){
			System.out.println("第" + n + "戦は[勝ち]です。");
		}else{
			System.out.println("第" + n + "戦は[負け]です。");
			}
		}

}



