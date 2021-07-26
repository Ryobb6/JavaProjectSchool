package chapter16;

import java.util.ArrayList;
import java.util.List;

public class Pra16_2 {
	public static void main(String[] args) {

		Hero hero = new Hero("斎藤");
		Hero hero2 = new Hero("鈴木");

		List<Hero> heroNameList = new ArrayList<Hero>();
		heroNameList.add(hero);
		heroNameList.add(hero2);

		// Heroインスタンスが入っているListなので、各要素をとる型をHero型とする。
		for(Hero heros : heroNameList){
			String name = heros.getName();
			System.out.println(name);
		}

	}

}
