package ensyu3;

public class Q04 {
	public static int max(int n, int m ,int l) {
		int[] array = {m, n, l};
		for(int i = 0; i < array.length -1; i++){
			if(array[i] < array[i+1]){
				continue;
			}else{
				int tmp = array[i];
				array[i] = array[i+1];
				array[i+1] = tmp;
			}
		}
		int max = array[2];
		return max;
	}


	public static void main(String[] args) {
		System.out.println("整数1を入れてください。>");
		int m = new java.util.Scanner(System.in).nextInt();
		System.out.println("整数2を入れてください。>");
		int n = new java.util.Scanner(System.in).nextInt();
		System.out.println("整数3を入れてください。>");
		int l = new java.util.Scanner(System.in).nextInt();
		System.out.println("3つの整数値の最大は" + max(m,n,l) + "です。");
	}

}
