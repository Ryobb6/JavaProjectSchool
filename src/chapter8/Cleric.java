package chapter8;

public class Cleric {
	String name;
	int hp = 50;
	// finalで書き換えは不可能となるが、staticで、どこのクラスからも、参照可能
	static final int MAX_HP = 50;
	int mp = 10;
	// finalで書き換えは不可能となるが、staticで、どこのクラスからも、参照可能
	static final int MAX_MP = 10;

	public void selfAid(){
		System.out.println(this.name + "はセルフエイドを唱えた");
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println("HPが最大まで回復した");
	}

	public int pray(int praySec){
		System.out.println(this.name + "は" + praySec + "秒間祈った");
		int aidNum = new java.util.Random().nextInt(2) + praySec;
		int recover = Math.min(this.MAX_MP - this.mp, aidNum);
		this.mp += recover;

		System.out.println("MPが" + recover + "回復した");
		return recover;
	}

}
