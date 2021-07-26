package chapter8;

public class Code8_16 {
	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.name = "ミナト";
		hero.hp = 100;

		Matango matango1 = new Matango();

		matango1.suffix = 'A';

		Matango matango2 = new Matango();

		matango2.suffix = '2';

		hero.slip();
		matango1.run();
		matango2.run();
		hero.run();



	}
}
