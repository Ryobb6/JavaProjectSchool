package chapter10;

public class Matango {
	int hp = 50;
	//final int LEVEL = 10;
	char suffix;
	// コンストラクタで、フィールドのsuffixへ値を渡す
	public Matango(char suffix){
		this.suffix = suffix;
	}

	public void attack(Hero h){
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
	}

	/*public void run(){
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した!");
	}*/
}
