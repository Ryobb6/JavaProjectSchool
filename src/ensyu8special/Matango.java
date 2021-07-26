package ensyu8special;

public class Matango {

	private String name;
	private int hp;
	private boolean defenseFlag;

	public Matango(String name){
		this.setName(name);
		this.setHp(100);
		this.defenseFlag = false;
	}
	/**
	 * 引数で敵をもってきて、
	 * 乱数を0～10で発生させてダメージを与える。
	 * 0の場合はミスと表示させる。
	 * @param h
	 */
	public void attack(Hero h){
		System.out.println(this.name + "の攻撃!!");
		int damage = new java.util.Random().nextInt(11);
		if(damage == 0){
			System.out.println("ミス");
		}else{
			h.setHp(h.getHp() - damage);
			System.out.println(h.getName() + "に" + damage + "ポイントのダメージ！！");
		}
	}

	/**
	 * リターンでbooleanのtrueを返す
	 * フラグで管理をしてtrueの場合はダメージ半減させる
	 *	ターン終了後にfalseに変える
	 * @return
	 */
	public boolean defense() {
		if(this.defenseFlag){

			this.defenseFlag = false;
		}
		return true;
	}

	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
