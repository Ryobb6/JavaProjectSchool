package chapter9;

public class Thief {
	String name;
	int hp;
	int mp;

	public Thief(String name, int hp, int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public Thief(String name, int hp){
		this(name, hp ,5);
	}

	public Thief(String name){
		this(name, 40);
		//引数2つで、MPは5で設定されている2番のコンストラクタを使いまわす
	}


}
