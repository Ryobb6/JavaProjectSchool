package ensyu16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
		List<Cat2> cats = new ArrayList<Cat2>();
		Scanner sc = new Scanner(System.in);
		// 新たな猫を作成します
		// 猫をインスタンス化しなければ、猫メソッドを使用できないことに違和感がある。
		CatCollectionSystem cllc = new CatCollectionSystem();
		Cat2 newcat = new Cat2("","");
		int select = 0;
		System.out.println("***キャット コレクション***");
		while(select != 3){
			hedder();
			select = sc.nextInt();
			switch(select){
			case 1 :
				cllc.collect(cats);
				break;
			case 2 :
				newcat.play(cats);
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
