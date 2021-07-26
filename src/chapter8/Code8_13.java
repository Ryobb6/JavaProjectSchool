package chapter8;

public class Code8_13 {
	public static void main(String[] args) {
		// 勇者を生成
		Hero hero = new Hero();
		// フィールドに初期値をセット
		hero.name = "ミナト";
		hero.hp = 100;
		System.out.println("勇者"  + hero.name + "を生み出しました");
		// 勇者のメソッドを呼び出してゆく
		hero.sit(5);
		hero.slip();
		hero.sit(25);
		hero.run();

	}
}
