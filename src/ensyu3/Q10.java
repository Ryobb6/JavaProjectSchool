package ensyu3;

public class Q10 {
	public static boolean numJudge(int num) {
		if(num%2 == 0){
		return true;
		}else{
		return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("整数を入れてください。>");
		int m = new java.util.Scanner(System.in).nextInt();
		if(numJudge(m)){
			System.out.println(m + "は偶数です。");
		}else{
			System.out.println(m + "は奇数です。");
		}
	}
}
