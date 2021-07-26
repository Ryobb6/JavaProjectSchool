package chapter8;

public class Hero {
	 String name; // クラス型 = 参照型なので、nullで初期化される。(フィールドなので、nullで初期化される)
	int hp; //フィールドの場合は、0で初期化される。

	public void sleep(){
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した!");
	}

	public void sit(int sec){
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った!");
		System.out.println("HPが" + sec + "ポイント回復した");
	}

	public void slip(){
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ!");
		System.out.println("5のダメージ!");
	}

	public void run(){
		System.out.println(this.name + "は、逃げ出した!");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}

}
