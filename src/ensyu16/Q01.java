package ensyu16;

import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
		// Scannerクラスのインスタンス生成
		Scanner sc = new Scanner(System.in);
		// 新たな猫リストを作成します
		Cat cat = new Cat("","");
		cat.makeNewList();
		int select = 0;
		System.out.println("***キャット コレクション***");
		while(select != 3){
			hedder();
			select = sc.nextInt();
			switch(select){
			case 1 :
				cat.collect();
				break;
			case 2 :
				cat.play();
				break;
			case 3 :
				System.out.println("終了します...");
				break;
			}
		}
	}

	// (インスタンス化せずに呼び出せるようにstatic) hedderメソッド
	public static void hedder(){
		System.out.println("------------------------------------------");
		System.out.println("1.コレクト  2.遊ぶ   3.終了");
	}


}
