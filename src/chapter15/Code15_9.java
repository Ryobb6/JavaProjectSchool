package chapter15;
import chapter13.Hero;

public class Code15_9 {
	public static void main(String[] args) {
		final String FORMAT = "勇者%sと申します。体力は%+dです";
		Hero hero = new Hero();
		hero.setName("ミナト");
		hero.setHp(20);
		String s = String.format(FORMAT, hero.getName(),hero.getHp());
		System.out.println(s);


	}
}
