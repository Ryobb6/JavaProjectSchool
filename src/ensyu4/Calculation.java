package ensyu4;

public class Calculation {
	public static int tasu(int m, int n){
		return (m + n);
	}

	public static int hiku(int m, int n){
		return (m - n);
	}

	public static boolean evenNumberJudge(int m){
		boolean judge = false;
		if (m%2 == 0){
			judge = true;
		}
		return judge;
	}

	public static boolean findNumber(int m){
		boolean judge = false;
		for(int i = 1; i <= 100; i++){
			int n = new java.util.Random().nextInt(100) + 1;
			if(m == n){
				System.out.println("「" + i +"回目に" + m + "を発見！ループを止めます　」");
				judge = true;
				break;
			}
		}
		return judge;
	}

	public static int[] arrayGeneration(int m){
		int[] array = new int[m];
		for(int i = 0;i < array.length; i++){
			array[i] = new java.util.Random().nextInt(100) + 1;
		}
		return array;
	}

}
