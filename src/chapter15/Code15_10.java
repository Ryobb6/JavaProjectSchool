package chapter15;

public class Code15_10 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();// 時間が記録される
		System.out.println("a"+"b"+"c");
		for(int i = 0;i < 100; i++){
			System.out.print(i);
		}
		System.out.println();
		long end = System.currentTimeMillis();// 時間が記録される
		System.out.println("処理にかかった時間は・・・" + (end - start) + "ミリ秒でした");

	}

}
