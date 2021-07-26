package ensyu16;

import java.util.List;

public class Cat2 {

	// フィールド
	private String type;	//A or B or C
	private String name;	//名前
	private int intimacy;	//親密度

	// コンストラクタ
	public Cat2(String type, String name, int intimacy){
		this.setType(type);
		this.setName(name);
	}
	public Cat2(String type, String name){
		this.setType(type);
		this.setName(name);
	}
	/**
	 * 猫たちと親密度をあげるメソッド
	 * リストで管理している猫達と遊びます。
	 */
	public void play(List<Cat2> cats){
		// Catsの要素が空の場合と、そうでない場合でわける。 猫を順番で出して、どの猫と遊ぶか選択
		if(cats.isEmpty()){
			System.out.println("キャットがいません");
		}else{
			for(int i = 0;i < cats.size(); i++){
				System.out.println(i+"・・・"+ cats.get(i).getName() + "["
						+ cats.get(i).getType()+ "]" +"(" + cats.get(i).getIntimacy() + ")");
			}
			System.out.println("どの子と遊びますか?");
			System.out.println((cats.size()+1) + "・・・ダルがらみをする");
			int n = new java.util.Scanner(System.in).nextInt();
			if(n <= cats.size()){
				String name = cats.get(n).getName();
				System.out.println(name + "と遊んだ");
				System.out.println("親密度がＵＰした");
				cats.get(n).setIntimacy(1);
			}else{
				System.out.println("猫はそっぽを向いた");
			}
		}
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
