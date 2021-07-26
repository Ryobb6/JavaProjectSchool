package chapter10;

public class PoisonMatango extends Matango{
	int poisonCount = 5;
	// char型を引数とするコンストラクタで値を取得し、
	// suffixの値を親クラスのコンストラクタへ、明示的に引数として渡す。
	// (このコンストラクタでは、自身のフィールドへの初期化は行わない)

	public PoisonMatango(char suffix){
		super(suffix);
		this.poisonCount = 6;
		System.out.println(poisonCount);
	}

	public void attack(Hero h){
		super.attack(h);
		if (this.poisonCount > 0){
			System.out.println("さらに独の胞子をばらまいた!");
		int damage = h.hp / 5;
		h.hp -= damage;
		System.out.println(damage + "のダメージ");
		this.poisonCount --;
		}



	}

}
