package ensyu3;

public class Q51 {
	public static void step(int m){
		for(int i = 1; i <= m; i++){
			for(int j = 1; j <= m; j++){
				if(i <= m - j){
				System.out.print("    ");
				}else{
					System.out.print("▬");
				}
			}
			System.out.println("");
		}
	}


	public static void main(String[] args) {
		System.out.println("整数を入れてください");
		int m = new java.util.Scanner(System.in).nextInt();
		step(m);
	}
}
