package chapter9;

public class Code9_4 {

	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero hero = new Hero();
		hero.name = "ミナト";
		hero.hp = 100;
		hero.sword = s ;


		System.out.println("現在の武器は" + hero.sword + hero.sword.toString() + hero.toString() + hero + hero.sword.name);
		// Heroが持っているswordのインスタンスの型@アドレス情報 /  Heroが持っているswordのインスタンスの型@アドレス情報 / heroインスタンスの型@アドレス情報 / heroが持っているswordの名前

		// Heroクラスでもソードクラスでも、toString()は宣言されていない。
		// Objectクラスに定義されている toString()は、パッケージ.クラス型名@英数字という形式で情報を文字列で表示するメソッド
		// HeroクラスもSwordクラスもObjectクラスを継承している
		// System.out.printlnは渡されたオブジェクト(≒インスタンス)のtoString()メソッドを利用して、画面に出力している
		// つまり、インスタンス名だけを入れた場合、そのインスタンスの型名@英数字を出力(そのオブジェクト(Objectクラスの子クラス内)でオーバーライドしていない場合)
		// to String()をオーバーライドして、戻り値に指定した文字列表現を入れていれば、その結果が表示される
		// System.out.printlnの中身が、文字列インスタンスの場合は、そのままその文字列インスタンスを出力する
	}

}
