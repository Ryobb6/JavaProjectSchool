package ensyu8special;

public class Hero {
	//フィールド
	private String name;
	private int hp;
	private int mp;
	private boolean defenseFlag;

	public Hero(String name){
		this.setName(name);
		this.setHp(100);
		this.setMp(20);
		this.defenseFlag = false;
	}
	/**
	 * 引数で敵をもってきて、
	 *	乱数を0～20で発生させてダメージを与える。
	 * 0の場合はミスと表示させる。
	 * @param m
	 */
	public void attack(Matango m){
		System.out.println(this.name + "の攻撃!!");
		int damage = new java.util.Random().nextInt(21);
		if(damage == 0){
			System.out.println("ミス");
		}else{
			m.setHp(m.getHp() - damage);
			System.out.println(m.getName() + "に" + damage + "ポイントのダメージ！！");
		}
	}

	public void spAttack(Matango m){
		System.out.println(this.name + "のSP攻撃!!");
		this.setMp(this.getMp() - 5);
		int damage = 20;
		m.setHp(m.getHp() - damage);
		System.out.println(m.getName() + "に" + damage + "ポイントのダメージ！！");
	}

	public boolean defense(){
		if(this.defenseFlag){

			this.defenseFlag = false;
		}
		return true;
	}

	// get/set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}

}
