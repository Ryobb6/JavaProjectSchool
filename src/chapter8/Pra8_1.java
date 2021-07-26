package chapter8;

public class Pra8_1 {

	public static void main(String[] args) {
		Cleric cleric = new Cleric();
		Hero[] hero = new Hero[3];
		cleric.selfAid();
		cleric.pray(3);
		for(int i = 0;i < hero.length; i++){
			hero[i] = new Hero();
		}
		System.out.println(hero[0].name);
	}
}
