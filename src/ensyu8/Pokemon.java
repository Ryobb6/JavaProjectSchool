package ensyu8;

public class Pokemon {
	//【フィールド】
	private String name;
	private int hp;


	//【コンストラクタ】
	public Pokemon(String name, int hp){
		this.name = name;
		this.hp = hp;
	}


	//【getter・setter】
	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getHp(){
		return this.hp;
	}

	public void setHp(int hp){
		this.hp = hp;
	}

}
