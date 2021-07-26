package chapter10;

public class Pra10 {
	public static void main(String[] args) {
		PoisonMatango pm = new PoisonMatango('A');
		Hero hero = new Hero();
		pm.attack(hero);
	}
}
