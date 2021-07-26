package ensyu16;

import java.util.List;
import java.util.Scanner;

public class CatCollectionSystem {
	/**
	 * 猫集めメソッド<br>
	 * 猫を集めていくメソッド
	 * 新たな猫と出会い、仲間にするか選択する。
	 * 新たな猫は、猫の登場メソッドを呼ぶこととする。
	 *
	 */
	public void collect(List<Cat2> cats){
		Cat2 cat = newCat();
		System.out.println(cat.getType() + "タイプのキャットが登場しました");
		System.out.println("仲間にしますか？");
		System.out.println("1 : はい ,  2 : いいえ");
		int m = new java.util.Scanner(System.in).nextInt();
		if(m == 1){
			System.out.println("名前は何にしますか？");
			Scanner sc2 = new Scanner(System.in);
			String str = sc2.nextLine();
			cat.setName(str);
			System.out.println(str + "が仲間になった");
			cats.add(cat);
		}else{
			System.out.println("猫はさみしそうに帰っていった");
			if(!(cats.isEmpty())){
				System.out.println("仲間達もさみしそうだ");
			}
		}
	}

	/**
	 * 名前のない、Typeのみの猫の登場メソッド(猫の登場 ~ タイプ分け)<br>
	 *  (インスタンス化せずに呼び出せるようにstatic)
	 *  @return catインスタンス
	 */
	public static Cat2 newCat(){
		String[] CAT_TYPE = new String[] {"A", "B", "C"};
		int m = new java.util.Random().nextInt(2);
		Cat2 cat = new Cat2("", CAT_TYPE[m]);
		return cat;
	}
}
