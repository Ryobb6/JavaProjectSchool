package ensyu16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cat {

	// フィールド
	private String type;	//A or B or C
	private String name;	//名前
	private int intimacy;	//親密度
	private List<Cat> cats; // 猫リスト

	// コンストラクタ
	public Cat(String type, String name, int intimacy){
		this.setType(type);
		this.setName(name);
	}
	public Cat(String type, String name){
		this.setType(type);
		this.setName(name);
	}

	/**
	 * 遊ぶメソッド
	 * @param cats2
	 */
	public void play(){
		// Catsの要素が空の場合と、そうでない場合でわける。
		if(this.cats.isEmpty()){
			System.out.println("キャットがいません");
		}else{
			for(int i = 0;i < this.cats.size(); i++){
				System.out.println(i+"・・・"+this.cats.get(i).getName() +"["
						+this.cats.get(i).getType()+ "]" +"(" +this.cats.get(i).getIntimacy() + ")");
			}
			System.out.println("どの子と遊びますか?");
			int n = new java.util.Scanner(System.in).nextInt();
			String nm = this.cats.get(n).getName();
			System.out.println(nm + "と遊んだ");
			System.out.println("親密度がＵＰした");
			this.cats.get(n).setIntimacy(1);
		}
	}

	/**
	 * 猫集めメソッド<br>
	 * 猫を集めていくメソッド
	 *
	 */
	public void collect(){
		Cat cat = newCat();
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
			this.cats.add(cat);
		}else{
			System.out.println("猫はさみしそうに帰っていった");
			if(!(this.cats.isEmpty())){
				System.out.println("仲間もさみしそうだ");
			}
		}

	}

	/**
	 * 名前のない、Typeのみの猫の生成メソッド<br>
	 *  (インスタンス化せずに呼び出せるようにstatic)
	 *  @return catインスタンス
	 */
	public static Cat newCat(){
		Cat cat = new Cat("","");
		int m = new java.util.Random().nextInt(2);
		switch(m){
		case 0:
			cat.setType("A");
			break;
		case 1:
			cat.setType("B");
			break;
		case 2:
			cat.setType("C");
			break;
		}
		return cat;
	}


	// Catsリストを作成し、フィールドにセットするメソッド
	// 友達を削除する予定はなく、また
	public void makeNewList(){
		List<Cat> cats = new ArrayList<Cat>();
		this.cats = cats;
	}


	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIntimacy() {
		return intimacy;
	}
	public void setIntimacy(int intimacy) {
		this.intimacy += intimacy;
	}


}
